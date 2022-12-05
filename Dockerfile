FROM openjdk:11-slim as builder
ARG SERVICE_HOST
# Сначала копируем только gradle-файлы и запускаем build (игнорируя любой вывод, в том числе ошибки), чтобы этот слой закешировался и следующие сборки были быстрее
COPY *gradle* /app/
ADD gradle /app/gradle
WORKDIR /app
RUN sh gradlew clean build --no-daemon > /dev/null 2>&1 || true
# А теперь копируем все остальное и собираем приложение
COPY . .
RUN sh gradlew clean build --no-daemon --info

FROM openjdk:11-jre-slim
ARG profile
ENV env_profile=$profile
WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/build/libs/*.jar /app/
# Чуть позже разберусь названиями, для первой итерации будет хардкод
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${env_profile}", "/app/bnpl-feedback-0.0.1-SNAPSHOT.jar"]

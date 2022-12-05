package ru.vzaytsev.auto;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.vzaytsev.auto.exception.ErrorInfoDto;

import java.util.Optional;

import static net.logstash.logback.argument.StructuredArguments.v;

@Component
public class Logger {
    private org.slf4j.Logger log;

    private String endpoint = null;

    public void init(Class clazz, String endpoint) {
        initLogger(clazz);
        initEndpoint(endpoint);
    }

    public void initLogger(Class clazz) {
        this.log = LoggerFactory.getLogger(clazz);
    }

    public void initEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void info(String message,  String methodName) {
        log(Level.INFO, message, null, methodName);
    }

    public void error(String message, Exception exception, String methodName) {
        log.error(message, exception, methodName);
    }

    private void log(Level level, String message, ErrorInfoDto description, String methodName) {
        switch (level) {
            case TRACE:
                break;
            case DEBUG:
                break;
            case INFO:
                log.info(message,
                        v("endpoint", endpoint),
                        v("methodName", methodName));
                break;
            case WARN:
                break;
            case ERROR:
                log.error(message,
                        v("endpoint", endpoint),
                        v("methodName", methodName),
                        v("errorCode", Optional.ofNullable(description).map(ErrorInfoDto::getText).orElse(null)),
                        v("errorDesc", Optional.ofNullable(description).map(ErrorInfoDto::toString).orElse(null)));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + level);
        }
    }

    private enum Level {
        TRACE, DEBUG, INFO, WARN, ERROR
    }
}

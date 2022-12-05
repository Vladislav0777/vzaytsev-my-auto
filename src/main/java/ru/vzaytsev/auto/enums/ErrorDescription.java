package ru.vzaytsev.auto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.logging.log4j.util.Strings;
import static lombok.AccessLevel.PRIVATE;

@Getter
@AllArgsConstructor(access = PRIVATE)
public enum ErrorDescription {
    UNKNOWN_ERROR("При выполнении запроса возникла неизвестная ошибка.", 500);

    private String code;
    private int status;

    public static Integer getHTTPStatus(String description) {
        if (Strings.isBlank(description)) {
            return null;
        }
        for (ErrorDescription value : values()) {
            if (value.code.equals(description)) {
                return value.status;
            }
        }
        throw new AssertionError("Неизвестное описание ошибки: " + description);
    }
}

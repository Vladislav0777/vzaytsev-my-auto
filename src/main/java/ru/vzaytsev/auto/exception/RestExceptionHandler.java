package ru.vzaytsev.auto.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vzaytsev.auto.enums.ErrorDescription;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {
    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorInfoDto> handleException(Exception e, HttpServletRequest request) {
        log.error(e.toString());
        return ResponseEntity.status(ErrorDescription.UNKNOWN_ERROR.getStatus()).body(
                new ErrorInfoDto(ErrorDescription.UNKNOWN_ERROR.getCode()));
    }

    @ExceptionHandler({MissingServletRequestParameterException.class})
    public ResponseEntity<ErrorInfoDto> handleException(MissingServletRequestParameterException e, HttpServletRequest request) {
        log.error(e.toString());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ErrorInfoDto("Requested parameter '" + e.getParameterName() + "' is missing"));
    }

    @ExceptionHandler({ErrorInfoException.class})
    public ResponseEntity<ErrorInfoDto> handleException(ErrorInfoException e, HttpServletRequest request) {
        log.error(e.toString());
        return ResponseEntity.status(ErrorDescription.getHTTPStatus(e.getText())).body(new ErrorInfoDto(e.getText()));
    }
}
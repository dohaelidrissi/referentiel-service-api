package com.bcp.exception;

import com.bcp.exception.exceptions.NotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;


@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ApiError notFoundException(Exception ex, WebRequest request) {
        return ApiError.builder()
                .timestamp(LocalDateTime.now())
                .status(NOT_FOUND.value())
                .message(ex.getMessage())
                .validations(new ArrayList<>())
                .description(request.getDescription(false))
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiError handleInvalidArgument(MethodArgumentNotValidException ex, WebRequest request) {
        ArrayList<String> validations = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> validations.add(error.getDefaultMessage()));
        return ApiError.builder()
                .timestamp(LocalDateTime.now())
                .status(BAD_REQUEST.value())
                .message("")
                .validations(validations)
                .description(request.getDescription(false))
                .build();
    }
}
/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 8 nov. 2020
 *
 */
package com.example.prueba.sanitas.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author miguel.villalobosbre
 *
 */
@ControllerAdvice
public class ControllerAdvisor {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ParametersException.class)
    @ResponseBody
    public ErrorMessage parametersException(final HttpServletRequest request, final Exception exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

    @ExceptionHandler(Exception.class)
    public ErrorMessage genericError(final HttpServletRequest request, final Exception exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(OperacionException.class)
    @ResponseBody
    public ErrorMessage operationException(final HttpServletRequest request, final Exception exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

}

/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 9 nov. 2020
 *
 */
package com.example.prueba.sanitas.exception;

/**
 * @author miguel.villalobosbre
 *
 */
public class ErrorMessage {

    private String exception;

    private String message;

    private String path;

    public ErrorMessage(final Exception ex, final String path) {
        this.exception = ex.getClass().getSimpleName();
        this.message = ex.getMessage();
        this.path = path;
    }

    /**
     * @return the exception
     */
    public String getException() {
        return this.exception;
    }

    /**
     * @param exception
     *            the exception to set
     */
    public void setException(final String exception) {
        this.exception = exception;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @param path
     *            the path to set
     */
    public void setPath(final String path) {
        this.path = path;
    }

}

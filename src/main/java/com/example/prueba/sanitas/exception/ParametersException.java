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

/**
 * @author miguel.villalobosbre
 *
 */
public class ParametersException extends RuntimeException {

    private static final long serialVersionUID = 2608011518501681430L;

    public ParametersException() {
        super("ERROR:Falta uno de los parámetros de entrada");
    }

}

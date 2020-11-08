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
public class OperacionException extends RuntimeException {

    private static final long serialVersionUID = 4122066365987725381L;

    public OperacionException() {
        super("ERROR:La operación no esta implementada.Puede que proximamente esté disponible");
    }

}

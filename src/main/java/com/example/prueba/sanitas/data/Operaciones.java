/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 4 nov. 2020
 *
 */
package com.example.prueba.sanitas.data;

/**
 * @author miguel.villalobosbre
 *
 */
public enum Operaciones {

    SUMA("+"), RESTA("-"), MULTIPLICACION("*"), DIVISION("/");

    private String signo;

    /**
     * @param signo
     */
    private Operaciones(final String signo) {
        this.signo = signo;
    }

    /**
     * @return the signo
     */
    public String getSigno() {
        return this.signo;
    }

    /**
     * @param signo
     *            the signo to set
     */
    public void setSigno(final String signo) {
        this.signo = signo;
    }

    public static Operaciones obtenerOperacionDesdeValor(final String valor) {
        final Operaciones[] operaciones = new Operaciones[] { SUMA, RESTA, MULTIPLICACION, DIVISION };
        for (int i = 0; i < operaciones.length; ++i) {
            final Operaciones opActual = operaciones[i];
            if (valor.equalsIgnoreCase(opActual.name()) || valor.equalsIgnoreCase(opActual.getSigno())) {
                return opActual;
            }
        }

        throw new RuntimeException("La operación " + valor + " no está implementada por el momento.");
    }

}

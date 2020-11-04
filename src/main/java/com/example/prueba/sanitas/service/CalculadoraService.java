/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 3 nov. 2020
 *
 */
package com.example.prueba.sanitas.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.prueba.sanitas.data.Operaciones;

/**
 * @author miguel.villalobosbre
 *
 */
@Service
public class CalculadoraService implements ICalculadoraService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraService.class);

    /*
     * (non-Javadoc)
     *
     * @see com.example.prueba.sanitas.service.ICalculadoraService#calcular(java.lang.String, java.lang.Double,
     * java.lang.Double)
     */
    @Override
    public BigDecimal calcular(final String operacion, final Double numero1, final Double numero2) {
        final Operaciones op = Operaciones.obtenerOperacionDesdeValor(operacion);
        switch (op) {
        case SUMA:
            return CalculadoraService.suma(numero1, numero2);
        case RESTA:
            return CalculadoraService.resta(numero1, numero2);
        case MULTIPLICACION:
            return CalculadoraService.multiplicacion(numero1, numero2);
        case DIVISION:
            return CalculadoraService.division(numero1, numero2);

        default:
            LOGGER.error("La operación no esta implementada.Puede estar disponible proximamente");
            throw new RuntimeException(
                    "La operación " + operacion.toString() + " no esta implementada por el momento.");
        }
    }

    private static BigDecimal suma(final Double numero1, final Double numero2) {
        BigDecimal resultado = new BigDecimal(numero1 + numero2);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        return resultado;

    }

    private static BigDecimal resta(final Double numero1, final Double numero2) {
        BigDecimal resultado = new BigDecimal(numero1 - numero2);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        return resultado;

    }

    private static BigDecimal multiplicacion(final Double numero1, final Double numero2) {
        BigDecimal resultado = new BigDecimal(numero1 * numero2);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        return resultado;

    }

    private static BigDecimal division(final Double numero1, final Double numero2) {
        BigDecimal resultado = new BigDecimal(numero1 / numero2);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        return resultado;
    }

}
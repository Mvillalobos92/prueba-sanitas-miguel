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
import com.example.prueba.sanitas.exception.OperacionException;
import com.example.prueba.sanitas.exception.ParametersException;

import io.corp.calculator.TracerImpl;

/**
 * @author miguel.villalobosbre
 *
 */
@Service
public class CalculadoraService implements ICalculadoraService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraService.class);

    private final TracerImpl tracerImpl = new TracerImpl();

    /*
     * (non-Javadoc)
     *
     * @see com.example.prueba.sanitas.service.ICalculadoraService#calcular(java.lang.String, java.lang.Double,
     * java.lang.Double)
     */
    @Override
    public BigDecimal calcular(final String operacion, final Double numero1, final Double numero2) {

        if ((numero1 == null) || (numero2 == null) || (operacion.isEmpty())) {
            throw new ParametersException();
        }

        BigDecimal resultado = null;
        final Operaciones op = Operaciones.obtenerOperacionDesdeValor(operacion);

        switch (op) {
        case SUMA:
            resultado = CalculadoraService.suma(numero1, numero2);
            break;
        case RESTA:
            resultado = CalculadoraService.resta(numero1, numero2);
            break;
        case MULTIPLICACION:
            resultado = CalculadoraService.multiplicacion(numero1, numero2);
            break;
        case DIVISION:
            resultado = CalculadoraService.division(numero1, numero2);
            break;

        default:
            throw new OperacionException();
        }

        this.tracerImpl.trace(resultado);

        return resultado;

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
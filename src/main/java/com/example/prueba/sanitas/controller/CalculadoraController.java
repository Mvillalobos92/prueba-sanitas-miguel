/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 3 nov. 2020
 *
 */
package com.example.prueba.sanitas.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.sanitas.service.CalculadoraService;

/**
 * @author miguel.villalobosbre
 *
 */
@RestController
public class CalculadoraController implements ICalculadoraController {

    private final CalculadoraService calculadoraService;

    /**
     * @param calculadoraService
     */
    @Autowired
    private CalculadoraController(final CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.example.prueba.sanitas.controller.ICalculadoraController#calcular(java.lang.String, java.lang.Double,
     * java.lang.Double)
     */
    @Override
    public ResponseEntity<BigDecimal> calcular(final String operacion, final Double numero1, final Double numero2) {
        return this.calculadoraService.calcular(operacion, numero1, numero2);

    }

}

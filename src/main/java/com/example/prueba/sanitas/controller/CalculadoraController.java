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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.sanitas.service.CalculadoraService;

/**
 * @author miguel.villalobosbre
 *
 */
@RestController
@RequestMapping(value = "/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    /**
     * @param calculadoraService
     */
    @Autowired
    private CalculadoraController(final CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping(value = "/calcular")
    public BigDecimal calcular(@RequestParam("operacion") final String operacion,
            @RequestParam("numero1") final Double numero1, @RequestParam("numero2") final Double numero2) {
        return this.calculadoraService.calcular(operacion, numero1, numero2);
    }

}

/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 12 nov. 2020
 *
 */
package com.example.prueba.sanitas.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author miguel.villalobosbre
 *
 */
@RequestMapping(value = "/calculadora")
public interface ICalculadoraController {

    @GetMapping(value = "/calcular")
    @ApiOperation(value = "Servicio calculadora", notes = "Servicio calculadora")
    @ApiResponses({ @ApiResponse(code = 201, message = "Successful create of a info") })
    public ResponseEntity<BigDecimal> calcular(@RequestParam("operacion") final String operacion,
            @RequestParam("numero1") final Double numero1, @RequestParam("numero2") final Double numero2);
}

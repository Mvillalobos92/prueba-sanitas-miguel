/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 5 nov. 2020
 *
 */
package com.example.prueba.sanitas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author miguel.villalobosbre
 *
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculadoraControllerTest {

    @LocalServerPort
    int port;

    private BigDecimal calcular(final String operacion, final double numero1, final double numero2)
            throws URISyntaxException {
        final RestTemplate restTemplate = new RestTemplate();

        final String url = "http://localhost:" + this.port + "/calculadora/calcular?numero1=" + numero1 + "&numero2="
                + numero2 + "&operacion=" + operacion;

        final URI uri = new URI(url);

        final ResponseEntity<BigDecimal> resultado = restTemplate.getForEntity(uri, BigDecimal.class);
        return resultado.getBody();
    }

    @Test
    public void suma_OK() throws URISyntaxException {
        final BigDecimal result = calcular("suma", 10, 5);
        BigDecimal expected = new BigDecimal(15);
        expected = expected.setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void resta_OK() throws URISyntaxException {
        final BigDecimal result = calcular("-", 25, 5);
        BigDecimal expected = new BigDecimal(20);
        expected = expected.setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void multiplicacion_OK() throws URISyntaxException {
        final BigDecimal result = calcular("multiplicacion", 10, 5);
        BigDecimal expected = new BigDecimal(50);
        expected = expected.setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void division_OK() throws URISyntaxException {
        final BigDecimal result = calcular("/", 10, 5);
        BigDecimal expected = new BigDecimal(2);
        expected = expected.setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expected, result);
    }

}

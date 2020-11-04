/**
 * Copyright (C) Luckia 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Luckia.
 *
 * 4 nov. 2020
 *
 */
package com.example.prueba.sanitas.service;

import java.math.BigDecimal;

/**
 * @author miguel.villalobosbre
 *
 */
public interface ICalculadoraService {

    BigDecimal calcular(String operacion, Double numero1, Double numero2);

}

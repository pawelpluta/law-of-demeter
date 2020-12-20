package com.lynxted.fruits.weak;

import java.math.BigDecimal;

abstract class Fruit {
    protected PlanetWeight weight;

    abstract BigDecimal computeWeight();
}

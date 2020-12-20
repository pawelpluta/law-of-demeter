package com.lynxted.fruits.strong;

import java.math.BigDecimal;

abstract class Fruit {
    private PlanetWeight weight;

    BigDecimal computeWeight() {
        return weight.getWeight().multiply(getWeightPercent());
    }
    abstract BigDecimal getWeightPercent();
}

package com.lynxted.fruits.strong;

import java.math.BigDecimal;

abstract class Fruit {
    private BigDecimal weight;

    BigDecimal computeWeight() {
        return weight.multiply(getWeightPercent());
    }
    abstract BigDecimal getWeightPercent();
}

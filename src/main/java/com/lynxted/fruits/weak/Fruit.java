package com.lynxted.fruits.weak;

import java.math.BigDecimal;

abstract class Fruit {
    protected BigDecimal weight;

    abstract BigDecimal computeWeight();
}

package com.lynxted.fruits.strong;

import java.math.BigDecimal;

class Apple extends Fruit {

    private static final BigDecimal PERCENT_OF_NET_WEIGHT = BigDecimal.valueOf(0.85);

    @Override
    BigDecimal getWeightPercent() {
        return PERCENT_OF_NET_WEIGHT;
    }
}

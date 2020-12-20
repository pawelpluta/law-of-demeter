package com.lynxted.fruits.weak;

import java.math.BigDecimal;

class Apple extends Fruit {

    private static final BigDecimal PERCENT_OF_NET_WEIGHT = BigDecimal.valueOf(0.85);

    @Override
    BigDecimal computeWeight() {
        return weight.getWeight().multiply(PERCENT_OF_NET_WEIGHT);
    }
}

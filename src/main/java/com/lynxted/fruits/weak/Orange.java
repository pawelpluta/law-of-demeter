package com.lynxted.fruits.weak;

import java.math.BigDecimal;

class Orange extends Fruit {

    private static final BigDecimal PERCENT_OF_NET_WEIGHT = BigDecimal.valueOf(0.80);

    @Override
    BigDecimal computeWeight() {
        return weight.getWeight().multiply(PERCENT_OF_NET_WEIGHT);
    }
}

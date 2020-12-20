package com.lynxted.fruits.weak;

import java.math.BigDecimal;

class Plum extends Fruit {

    private static final BigDecimal PERCENT_OF_NET_WEIGHT = BigDecimal.valueOf(0.65);

    @Override
    BigDecimal computeWeight() {
        return weight.getWeight().multiply(PERCENT_OF_NET_WEIGHT);
    }
}

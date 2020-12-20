package com.lynxted.fruits.weak;

import java.math.BigDecimal;

class Basket {
    private Fruits fruits;

    BigDecimal computeWeight() {
        return fruits.computeWeight();
    }
}

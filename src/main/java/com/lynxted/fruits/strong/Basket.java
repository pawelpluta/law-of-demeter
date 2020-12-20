package com.lynxted.fruits.strong;

import java.math.BigDecimal;

class Basket {
    private Fruits fruits;

    BigDecimal computeWeight() {
        return fruits.computeWeight();
    }
}

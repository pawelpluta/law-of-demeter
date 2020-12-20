package com.lynxted.fruits.strong;

import java.math.BigDecimal;
import java.util.List;

class Fruits {

    private List<Fruit> fruits;

    BigDecimal computeWeight() {
        return fruits.stream().map(Fruit::computeWeight).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

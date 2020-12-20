package com.lynxted.fruits.strong;

import java.math.BigDecimal;

class PlanetWeight {

    private BigDecimal gravity;
    private BigDecimal mass;

    BigDecimal getWeight() {
        return mass.multiply(gravity);
    }
}

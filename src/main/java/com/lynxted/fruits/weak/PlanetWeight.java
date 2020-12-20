package com.lynxted.fruits.weak;

import java.math.BigDecimal;

class PlanetWeight {

    private BigDecimal gravity;
    private BigDecimal mass;

    BigDecimal getWeight() {
        return mass.multiply(gravity);
    }
}

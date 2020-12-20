package com.lynxted.lawOfDemeter;

import java.math.BigDecimal;

class Member {
    private EmployeeContract contractType;
    private BigDecimal salary;

    EmployeeContract getContractType() {
        return contractType;
    }

    BigDecimal getCost() {
        return salary;
    }
}

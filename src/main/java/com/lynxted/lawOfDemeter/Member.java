package com.lynxted.lawOfDemeter;

import java.math.BigDecimal;

class Member {
    private Contact contact;
    private EmployeeContract contractType;
    private BigDecimal salary;

    Contact getContact() {
        return contact;
    }

    EmployeeContract getContractType() {
        return contractType;
    }

    BigDecimal getCost() {
        return salary;
    }
}

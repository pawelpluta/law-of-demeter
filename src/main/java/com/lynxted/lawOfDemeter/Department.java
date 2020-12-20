package com.lynxted.lawOfDemeter;

import java.math.BigDecimal;
import java.util.List;

class Department {

    private DepartmentCode code;
    private List<Team> teams;

    DepartmentCode getCode() {
        return code;
    }

    BigDecimal cost() {
        return teams.stream().map(this::cost).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal cost(Team team) {
        return team.getMembers().stream().map(Member::getCost).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}

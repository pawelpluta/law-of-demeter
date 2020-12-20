package com.lynxted.lawOfDemeter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Company {

    private List<Department> departments;

    Map<DepartmentCode, BigDecimal> costPerDepartment() {
        Map<DepartmentCode, BigDecimal> costPerDepartment = new HashMap<>();
        departments.forEach(department -> {
            DepartmentCode departmentCode = department.getCode();
            BigDecimal employeesCost = department.getDivisions().stream()
                                                 .map(Division::getTeams).flatMap(List::stream)
                                                 .map(Team::getMembers).flatMap(List::stream)
                                                 .map(Member::getCost).reduce(BigDecimal.ZERO, BigDecimal::add);
            costPerDepartment.put(departmentCode, employeesCost);
        });
        return costPerDepartment;
    }
}

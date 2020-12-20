package com.lynxted.lawOfDemeter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Company {

    private List<Department> departments;

    Map<DepartmentCode, BigDecimal> costPerDepartment() {
        return departments.stream()
                          .filter(this::costCentre)
                          .collect(Collectors.toMap(Department::getCode, Department::cost));
    }

    private boolean costCentre(Department department) {
        return department.isCostCentre();
    }
}

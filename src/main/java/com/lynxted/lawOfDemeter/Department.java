package com.lynxted.lawOfDemeter;

import java.util.List;

class Department {

    private DepartmentCode code;
    private List<Division> divisions;

    DepartmentCode getCode() {
        return code;
    }

    List<Division> getDivisions() {
        return divisions;
    }
}

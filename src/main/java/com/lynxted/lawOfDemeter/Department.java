package com.lynxted.lawOfDemeter;

import java.util.List;

class Department {

    private DepartmentCode code;
    private List<Team> teams;

    DepartmentCode getCode() {
        return code;
    }

    List<Team> getTeams() {
        return teams;
    }
}

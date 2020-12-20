package com.lynxted.lawOfDemeter;

import java.util.List;

class Division {
    private Member supervisor;
    private List<Team> teams;

    Member getSupervisor() {
        return supervisor;
    }

    List<Team> getTeams() {
        return teams;
    }
}

package com.lynxted.lawOfDemeter;

import java.util.List;

class Team {

    private Member manager;
    private List<Member> members;

    Member getManager() {
        return manager;
    }

    List<Member> getMembers() {
        return members;
    }
}

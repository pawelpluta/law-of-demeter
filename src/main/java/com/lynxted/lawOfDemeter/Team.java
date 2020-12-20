package com.lynxted.lawOfDemeter;

import java.util.List;

class Team {

    private Member manager;
    private List<Member> members;

    List<Member> getMembers() {
        return members;
    }

    String managerMail() {
        Contact contact = manager.getContact();
        return contact.getMail();
    }

    String managerName() {
        Contact contact = manager.getContact();
        PersonalData personalData = contact.getPersonalData();
        return String.format("%s %s", personalData.getName(), personalData.getSurname());
    }
}

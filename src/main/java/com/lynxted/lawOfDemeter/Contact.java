package com.lynxted.lawOfDemeter;

class Contact {
    private PersonalData personalData;
    private String mail;

    PersonalData getPersonalData() {
        return personalData;
    }

    String getMail() {
        return mail;
    }
}

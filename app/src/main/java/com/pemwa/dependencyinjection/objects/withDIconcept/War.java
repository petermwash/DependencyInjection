package com.pemwa.dependencyinjection.objects.withDIconcept;

public class War {

    private Starks starks;
    private Boltons boltons;

    //DI concept here - we are getting dependencies from else where via constructor
    public War(Starks starks, Boltons boltons) {
        this.starks = starks;
        this.boltons = boltons;
    }

    public String prepare() {
        return starks.prepareForWar() + " and " + boltons.prepareForWar();
    }

    public String report() {
        return starks.reportForWar() + " and " + boltons.reportForWar();
    }

    public String fight() {
        return "The Starks and the Boltons are fighting in the war of the Bastards";
    }
}

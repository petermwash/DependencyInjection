package com.pemwa.dependencyinjection.objects.withDagger2;

import javax.inject.Inject;

public class War {

    private Starks starks;
    private Boltons boltons;

    @Inject
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

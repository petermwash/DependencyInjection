package com.pemwa.dependencyinjection.objects.noDI;

public class War {

    private Starks starks;
    private Boltons boltons;

    public War() {
        starks = new Starks();
        boltons = new Boltons();

        starks.prepareForWar();
        boltons.prepareForWar();
        starks.reportForWar();
        boltons.reportForWar();
    }
}

package com.pemwa.dependencyinjection.objects.noDI;

public class Starks implements House {

    @Override
    public String prepareForWar() {

        return "The Starks are preparing for war...";
    }

    @Override
    public String reportForWar() {

        return "The Starks are reporting to war...";
    }
}

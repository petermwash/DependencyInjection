package com.pemwa.dependencyinjection.objects.withDagger2;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks() {}

    @Override
    public String prepareForWar() {

        return "The Starks are preparing for war...";
    }

    @Override
    public String reportForWar() {

        return "The Starks are reporting to war...";
    }
}

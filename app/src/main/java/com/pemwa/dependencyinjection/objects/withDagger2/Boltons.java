package com.pemwa.dependencyinjection.objects.withDagger2;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons() {}

    @Override
    public String prepareForWar() {

        return "The Boltons are preparing for war...";
    }

    @Override
    public String reportForWar() {

        return "The Boltons are reporting to war...";
    }
}

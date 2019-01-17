package com.pemwa.dependencyinjection.objects.noDI;

public class Boltons implements House {

    @Override
    public String prepareForWar() {

        return "The Boltons are preparing for war...";
    }

    @Override
    public String reportForWar() {

        return "The Boltons are reporting to war...";
    }
}

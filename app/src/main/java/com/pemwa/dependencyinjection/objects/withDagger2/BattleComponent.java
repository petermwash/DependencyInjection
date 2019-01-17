package com.pemwa.dependencyinjection.objects.withDagger2;

import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();
//    Starks getStarks();
//    Boltons getBoltons();
}

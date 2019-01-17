package com.pemwa.dependencyinjection.objects.example;

import com.pemwa.dependencyinjection.objects.example.Dragons;

public class Targaryens {

    public Targaryens() {

        //Each  time we use Targaryens, we need to create Dragons instance
        //Hard dependency - solved by using dependency injection technique

        Dragons dragons = new Dragons();
        dragons.callForWar();
    }
}

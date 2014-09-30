package com.test.cuke;

/**
 * Created by Armando on 29/09/2014.
 */
public class Belly {

    private int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public String getSound(int waitingTime) {
        if (cukes > 41 && waitingTime >= 1) {
            System.out.println("returning growl sound");
            return "growl";
        } else {
            System.out.println("returning silent sound");
            return "silent";
        }
    }
}

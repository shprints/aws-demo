package com.company;

import java.util.concurrent.TimeUnit;

import static java.time.LocalTime.now;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println("kek: " + now());
            TimeUnit.SECONDS.sleep(2);
        }
    }
}

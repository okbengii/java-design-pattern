package com.beng.design.factory;

/**
 * @author apple
 */
public class Main {

    public static void main(String[] args) {

        Car audi = new Audi();
        Car byd = new Byd();

        audi.run();
        byd.run();

    }

}

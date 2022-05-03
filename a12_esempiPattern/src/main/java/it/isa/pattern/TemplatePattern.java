package it.isa.pattern;

// file Engine.java
abstract class Engine {
    abstract void init();
    abstract void start();
    abstract void stop();

    public final void turnOn() {
        init();
        start();
        stop();
    }
}

// file Rocket.java
class Rocket extends Engine {
    public void init() {
        System.out.println("Init rocket");
    }

    public void start() {
        System.out.println("Start rocket");
    }

    public void stop() {
        System.out.println("Stop rocket");
    }
}

// file Car.java
class Car extends Engine {
    public void init() {
        System.out.println("Init car");
    }

    public void start() {
        System.out.println("Start car");
    }

    public void stop() {
        System.out.println("Stop car");
    }
}

// 'client'
public class TemplatePattern {
    public static void esegui() {
        System.out.println("Template pattern");
        Engine e = new Rocket();
        e.turnOn();

        e = new Car();
        e.turnOn();
    }
}
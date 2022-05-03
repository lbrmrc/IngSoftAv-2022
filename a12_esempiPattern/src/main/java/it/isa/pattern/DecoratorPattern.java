package it.isa.pattern;

// file NewEngine.java
interface NewEngine {
    public void run();
}

// file NewCar.java
class NewCar implements NewEngine {
    public void run() {
        System.out.println("The car is running");
    }
}

// file NewRocket.java
class NewRocket implements NewEngine {
    public void run() {
        System.out.println("The rocket is running");
    }
}

// file EngineDecorator.java
abstract class EngineDecorator implements NewEngine {
    protected NewEngine decoratedEngine;

    public EngineDecorator(NewEngine decoratedEngine) {
        this.decoratedEngine = decoratedEngine;
    }

    public void run() {
        decoratedEngine.run();
    }
}

// file BoostedEngineDecorator.java
class BoostedEngineDecorator extends EngineDecorator {
    public BoostedEngineDecorator(NewEngine engine) {
        super(engine);
    }

    private void boostIt() {
        System.out.println("Boosted");
    }

    public void run() {
        decoratedEngine.run();
        boostIt();
    }
}

// 'client'
public class DecoratorPattern {
    public static void esegui() {
        System.out.println("Decorator pattern");
        NewEngine e = new NewCar();

        e.run();

        NewEngine boostedCar = new BoostedEngineDecorator(new NewCar());

        boostedCar.run();

        NewEngine boostedRocket = new BoostedEngineDecorator(new NewRocket());

        boostedRocket.run();
    }
}
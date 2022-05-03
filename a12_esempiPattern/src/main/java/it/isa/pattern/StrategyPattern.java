package it.isa.pattern;

// file Strategy.java
interface Strategy {
    public String doOp(String s);
}

// file ConvertLowercase.java
class ConvertLowercase implements Strategy {
    public String doOp(String s) {
        return s.toLowerCase();
    }
}

// file ConvertUppercase.java
class ConvertUppercase implements Strategy {
    public String doOp(String s) {
        return s.toUpperCase();
    }
}

// file Capitalize.java
class Capitalize implements Strategy {
    public String doOp(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}

// file Context.java
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String doOp(String s) {
        return strategy.doOp(s);
    }
}

// 'client'
public class StrategyPattern {
    public static void esegui() {
        System.out.println("Strategy pattern");
        String s = "pRoVa";

        Context c = new Context(new ConvertLowercase());
        System.out.println(c.doOp(s));

        c = new Context(new ConvertUppercase());
        System.out.println(c.doOp(s));

        c = new Context(new Capitalize());
        System.out.println(c.doOp(s));
    }
}
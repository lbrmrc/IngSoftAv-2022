package it.isa.pattern;

import it.isa.pattern.IteratorPattern;
import it.isa.pattern.TemplatePattern;
import it.isa.pattern.DecoratorPattern;
import it.isa.pattern.StrategyPattern;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Esempi pattern");
        IteratorPattern.esegui();
        TemplatePattern.esegui();
        DecoratorPattern.esegui();
        StrategyPattern.esegui();
        StrategyInterfaceA.esegui();
        StrategyInterfaceLambda.esegui();
    }
}
package it.isa.pattern;

// file StrategyIntLambda.java
interface StrategyIntLambda {
    public String doOp(String s);
}

public class StrategyInterfaceLambda {

    public static StrategyIntLambda Converter() {
        return s -> s.toUpperCase();
    }

    public static void esegui() {
        System.out.println("Strategy pattern con lambda"); 
        String s = "pRoVa";
        
        StrategyIntLambda siLowerLambda = parola -> parola.toLowerCase();

        System.out.println(siLowerLambda.doOp(s));

        StrategyIntLambda siUpperLambda = Converter();

        System.out.println(siUpperLambda.doOp(s));   
    }
}
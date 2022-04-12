package it.isa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.Optional;

public class TestStream {

    // stampare le parole di lunghezza superiore a 3 
    // che iniziano con la lettera 'a', utilizzando
    // gli stream
    public static void esercizio() {
        String[] arrayParole = { "casa", "albero", "oca" };
        List<String> lParole = new ArrayList<String>(Arrays.asList(arrayParole));

        // System.out.println(lParole.stream().filter(x -> x.length() > 3).filter(x -> x.startsWith("a")).collect(Collectors.toList()));
        System.out.println(lParole.stream().filter(x -> x.length() > 3 && x.startsWith("a")).collect(Collectors.toList()));
    }

    public static void provaOptional() {
        Stream<Double> numeriRandom = Stream.generate(Math::random).limit(10);
        Optional<Double> risultato = numeriRandom.filter(x-> x > 1).findFirst();

        System.out.println(risultato.orElseGet(() -> {
            double a = 2;
            double b = 3;
            return a+b;
        }));
        // System.out.println(risultato.orElse((double) -1));
        // System.out.println(risultato.get());
    }

    public static void provaInfiniti() {
        Stream<Double> numeriRandom = Stream.generate(Math::random).limit(10);
        List<Double> listaNumeri = numeriRandom.collect(Collectors.toList());
        System.out.println(listaNumeri);
        
        Stream<Double> numeriRandom2 = Stream.generate(Math::random).limit(10);
        System.out.println(numeriRandom2.count());
    }

    public static void provaMap() {
        String[] arrayParole = { "casa", "albero", "oca" };
        List<String> lParole = new ArrayList<String>(Arrays.asList(arrayParole));
        
        Stream<String> paroleMaiuscole = lParole.stream()
            .filter(x -> x.length() > 3)
            .map(String::toUpperCase)
            .map(s -> s.replace("A", "O"));


        paroleMaiuscole.forEach(x -> System.out.println(x));
    }

    public static void provaFilter() {
        String[] arrayParole = { "casa", "albero", "oca" };
        List<String> lParole = new ArrayList<String>(Arrays.asList(arrayParole));

        Stream<String> paroleLunghe = lParole.stream().filter(x -> x.length() > 3);
        paroleLunghe.forEach(x -> System.out.println(x));
    }

    public static void provaForEach() {
        Stream<String> parole = Stream.of("a","b");
        parole.forEach(x -> System.out.println(x));

        String[] arrayParole = {"casa","albero","oca"};
        List<String> lParole = new ArrayList<String>(Arrays.asList(arrayParole));
        List<String> lParole2 = new ArrayList<String>(Arrays.asList(arrayParole));
        lParole.stream().forEach(x -> System.out.println(x));

        lParole2.stream().forEach((String x) -> {
            String y = x + "_a"; 
            System.out.println(y);
        });
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        TestStream.provaForEach();
        TestStream.provaFilter();
        TestStream.provaMap();
        TestStream.provaInfiniti();
        TestStream.provaOptional();
        TestStream.esercizio();
    }
}

package it.isa.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;


public class Collezioni {

    public static void testMap() {
        System.out.println("--- Test map --");

        Map<String,String> hm = new HashMap<String,String>();

        hm.put("A", "Italia");
        hm.put("B", "Francia");
        hm.put("C", "Germania");

        System.out.println("Stampa valori");
        for(String s : hm.values()) {
            System.out.println(s);
        }

        System.out.println("Stampa chiavi");
        for (String s : hm.keySet()) {
            System.out.println(s);
        }
    }

    public static void liste() {
        List<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("casa");

        System.out.println("Dimensione lista:");
        System.out.println(lista.size());

        System.out.println("Elementi lista:");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.removeIf(x -> x.length() > 1);

        System.out.println("Elementi lista dopo rimozione:");
        System.out.println(lista);

        String[] parole = {"a","b","c"};
        List<String> paroleList1 = new ArrayList<String>();

        for(String s : parole) {
            paroleList1.add(s);
        }
        System.out.println(paroleList1);

        List<String> paroleList2 = new ArrayList<String>(Arrays.asList(parole));
        System.out.println(paroleList2);
    } 
    public static void main(String[] args) {
        // System.out.println("In main");
        // Collezioni.liste();
        Collezioni.testMap();
    }
}
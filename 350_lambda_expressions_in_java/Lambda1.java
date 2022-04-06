import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
    public static void main(String[] argv) {
        List<Integer> a = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++)
            a.add(i);

        stampa(a);

        List<Integer> b;
        b = f(a, Lambda1::doppio);
        stampa(b);

        List<Integer> c = f(a, Lambda1::triplo);
        stampa(c);

        List<Integer> d = f(a, Lambda1::quadrato);
        stampa(d);
    }

    static Integer doppio(Integer n) {
        return 2 * n;
    }

    static Integer triplo(Integer n) {
        return 3 * n;
    }

    static Integer quadrato(Integer n) {
        return n * n;
    }


    private static List<Integer> f(List<Integer> a, Fun g) {
        List<Integer> b;
        b = new ArrayList<Integer>();
        for (Integer e : a) {
            b.add(g.applica(e));
        }
        return b;
    }

    private static void stampa(List<Integer> a) {
        for (Integer e : a) {
            System.out.print(e);
            System.out.print(" ");
        }
        System.out.println();
    }
}

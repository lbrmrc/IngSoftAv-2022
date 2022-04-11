import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
    public static void main(String[] argv) {
        List<Integer> a = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++)
            a.add(i);

        stampa(a);

        List<Integer> b;
        b = map(a, n -> 2 * n); // lambda expression o funzione anonima
        stampa(b);

        List<Integer> c = map(a, n -> 3 * n);
        stampa(c);

        List<Integer> d = map(a, n -> n * n);
        stampa(d);
    }

    private static List<Integer> map(List<Integer> a, Fun g) {
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

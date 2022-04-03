import java.util.function.Function;

public class Ritorno {
    static Function<Integer, Integer> creaDoppio() {
        return x -> 2 * x;
    }

    public static void main(String[] argv) {
        Function<Integer, Integer> doppio = creaDoppio();
        System.out.println(doppio.apply(5));
    }
}
import java.util.function.Supplier;

public class Counter {
    static Supplier<Integer> makeCounter(int init){
        return () -> {
            init++; /* errore:
            Local variable init defined in an enclosing scope 
            must be final or effectively final
            */
            return init-1;
        };
    }
    public static void main(String[] argv){
        Supplier<Integer> c1, c2;
        c1 = makeCounter(1); c2 = makeCounter(1);
        System.out.println(c1.get()); System.out.println(c1.get());
        System.out.println(c2.get()); System.out.println(c2.get());
    }
}
import java.util.function.Supplier;

public class CounterStatico {
    static int init = 1;

    static Supplier<Integer> makeCounter(){
        return () -> {
            init++; // corretto: ma init e` condivisa!
            return init-1;
        };
    }
    public static void main(String[] argv){
        Supplier<Integer> c1, c2;
        c1 = makeCounter(); c2 = makeCounter();
        System.out.println(c1.get()); System.out.println(c1.get());
        System.out.println(c2.get()); System.out.println(c2.get());
    }
}
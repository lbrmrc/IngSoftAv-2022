import java.util.function.Supplier;

public class SupplierClasseAnonima {
    public static void main(String[] argv) {
        Supplier<Integer> f;
        f = new Supplier<Integer>() {
            public Integer get() {
                return 5;
            }
        };
        System.out.println(f.get());
        System.out.println(f.get());
    }
}
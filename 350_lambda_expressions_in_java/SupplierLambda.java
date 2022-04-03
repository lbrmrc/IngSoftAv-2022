import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] argv) {
        Supplier<Integer> f;
        f = () -> 5;
        System.out.println(f.get());
    }
}
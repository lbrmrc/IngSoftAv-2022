import java.util.function.Supplier;

public class SupplierMetodo {

    static Integer Cinque() {
        return 5;
    }

    public static void main(String[] argv) {
        Supplier<Integer> f;
        f = SupplierMetodo::Cinque;
        System.out.println(f.get());
    }
}
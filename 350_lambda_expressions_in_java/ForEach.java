import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static <T> void perOgni(List<T> l, Consumer<T> azione) {
        for (T e : l)
            azione.accept(e);
    }

    public static void main(String[] argv){
        List<String> l = Arrays.asList(argv);
        perOgni(l, arg -> {
            System.out.print(arg); System.out.print(";");
        });
        System.out.println();
    }
}
public class DueParametri {
    public static void main(String[] argv){
        FunzioneDueParametri<Float, Integer, Float> f =
             (Float x, Integer n) -> x * n;
        System.out.println(f.applica(2.5f,3));
    }
}
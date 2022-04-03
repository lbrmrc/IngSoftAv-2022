using System;
public class Counter {
    static Func<int> makeCounter(int init){
        return () => {
            init++;
            return init-1;
        };
    }
    public static void Main(){
        Func<int> c1, c2;
        c1 = makeCounter(1); c2 = makeCounter(1);
        Console.WriteLine(c1()); Console.WriteLine(c1());
        Console.WriteLine(c2()); Console.WriteLine(c2());
    }
}
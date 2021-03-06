package pair2;
import java.time.*;

public class PairTest2 {
    public static void main(String[] args)
    {
        LocalDate[] birthdays =
                {
                        LocalDate.of(1906, 1, 23),
                        LocalDate.of(1908, 3, 19),
                        LocalDate.of(1934, 10, 23),
                        LocalDate.of(1812, 9, 30),
                };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min =" + mm.getFirst());
        System.out.println("max =" + mm.getSecond());
    }

}

class ArrayAlg{
    public static < T extends Comparable> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for ( int i = 1; i < a.length; i++)
        {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}

package pair3;


public class PairTest3
{
    public static void main(String[] args)
    {
        Manger ceo = new Manger("Gus Greedy", 800000, 2003, 12, 15);
        Manger cfo = new Manger("Sid Sneaky", 600000, 2003, 12, 15);
        Pair<Manger> buddies = new Pair<>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        Manger[] managers = {ceo, cfo};

        Pair<Employee> result = new Pair<>();
        minmaxBonus(managers, result);
        System.out.println("first = " + result.getFirst().getName() + ", second:" + result.getSecond().getName());
        maxminBonus(managers, result);
        System.out.println("first = " + result.getFirst().getName() + ", second:" + result.getSecond().getName());
    }


    public static void printBuddies(Pair<? extends Employee> p)
    {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + "and" + second.getName()+ "are buddies");
    }

    public static void minmaxBonus(Manger[] a, Pair<? super Manger> result)
    {
        if (a.length == 0) return;
        Manger min = a[0];
        Manger max = a[0];
        for ( int i = 1; i < a.length; i++)
        {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }
    public static void maxminBonus(Manger[] a, Pair<? super Manger> result)
    {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result);
    }
}

class PairAlg
{
    public static boolean hasNulls(Pair<?> p)
    {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) { swapHelper(p); }

    public static <T> void swapHelper(Pair<T> p)
    {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}




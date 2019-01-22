package staticInnerClass;
public class StaticInnerClassTest {
    public static void main(String[] args)
    {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg
{
    /**
     * A pair of floating-point numbers
     */
    public static class Pair
    {
        private double first;
        private double second;

        /**
         * Constructs a pair from two floating-point numbers
         */
        public Pair(double f, double s)
        {
            first = f;
            second = s;
        }
        /**
         * Return the first number of the pair
         */
        public double getFirst()
        {
            return first;
        }
        /**
         * Return the second number of the pair
         */
        public double getSecond()
        {
            return second;
        }
    }
    /**
     * Computes both the minimum and the maximum of an array
     */
    public static Pair minmax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values)
        {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
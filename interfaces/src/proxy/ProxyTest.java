package proxy;

import java.lang.reflect.*;
import java.util.*;

public class ProxyTest
{
    public static void main(String[] args)
    {
        Object[] elements = new Object[1000];

        //fill elements with proxies for the integers 1...1000
        for (int i = 0; i < elements.length; i++)
        {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[] { Comparable.class } , handler);
            elements[i] = proxy;
        }
        //construct a random integer
        Integer key = new Random().nextInt(elements.length) + 1;

        //search for the key
        int result = Arrays.binarySearch(elements, key);

        // print match if found
        if (result >= 0) System.out.println(elements[result]);
    }
}

/**
 * An invocation handler that prints out the method name and parameters,then
 * invokes the original method
 */

class TraceHandler implements InvocationHandler
{
    private Object target;

    /**
     * Constructs a TraceHandler
     */

    public TraceHandler(Object t)
    {
        target = t;
    }
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable
    {
        //print implicit argument
        System.out.print(target);
        System.out.println("." + m.getName() + ")");
        if (args != null)
        {
            for (int i = 0; i < args.length; i++)
            {
                System.out.print(arg[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");
        return m.invoke(target, args);
    }
}

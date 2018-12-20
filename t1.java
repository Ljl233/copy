package Test1;
import java.util.*;
public class t1 {

    public static void main(String[] args) {
        test1 t1=new test1();
        //ArrayList<Integer> list=new ArrayList<Integer>();
        //t1.a(list);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list=t1.b("result");
        System.out.println(list);
    }

}

class test1
{

    public ArrayList b(String s){
        ArrayList a1=new ArrayList();
        a1.add(s);
        return a1;
    }
}


package Collection;
import java.util.*;
public class TreeSet_01
{
    public static void main(String []args)
    {
        TreeSet ts1= new TreeSet();

        ts1.add(100);
        ts1.add(101);
        ts1.add(102);
        ts1.add(105);
        ts1.add(150);
        ts1.add(166);

        System.out.println(ts1);
        System.out.println(ts1.higher(150));
        System.out.println(ts1.lower(105));
    }

}

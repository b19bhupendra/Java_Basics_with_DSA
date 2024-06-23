package Collection;

import java.util.*;

public class ArrayDeque_01
{
    public static void main(String []args)
    {
        ArrayDeque ad1= new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(11);
        ad1.addLast(44);
        ad1.add("Hey");
        System.out.println(ad1);

    }
}

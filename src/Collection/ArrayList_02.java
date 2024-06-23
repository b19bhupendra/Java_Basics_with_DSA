package Collection;

import java.util.*;

public class ArrayList_02
{
    public static void main(String []args)
    {
        ArrayList all1=new ArrayList();
        all1.add(12);
        all1.add("HEllo");
        all1.add(58);
        all1.add(4.5);
        System.out.println(all1);

        System.out.println(all1.contains(12));
        int index=all1.indexOf(4.5);
        System.out.println("indexing starts from zero in arraylist "+ index);

        System.out.println(all1.size());
        all1.ensureCapacity(10);
        all1.add("After capacity");
        System.out.println(all1);
        all1.trimToSize();;
        System.out.println(all1.size());
    }
}

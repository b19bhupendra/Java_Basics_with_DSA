package Collection;
import java.util.*;
public class Iterator_01
{
    public static void main(String []args)
    {
        ArrayList ar= new ArrayList();
        ar.add(12);
        ar.add(88);
        ar.add(23);
        ar.add(44);
        ar.add(21);

        System.out.println(ar);

        //for loop
        // for (int i =0;i<ar.size();i++)
        //{
        //  Object o=ar.get(i);
        // System.out.println(o);
        // System.out.println(ar.get(i));
        //}

        //for each
        //for(Object o:ar)
        //{
        //  System.out.println(o);
        //}

        Iterator itr= ar.iterator();
        while(itr.hasNext())
        {
          //  Integer i=(Integer) itr.next();//ye data object dega to use integer krne k liye...
            System.out.println(itr.next());
        }
        System.out.println("___________________________________");
        ListIterator litr=ar.listIterator(ar.size());

        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }










    }

}

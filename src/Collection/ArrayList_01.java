package Collection;
import java.util.*;
public class ArrayList_01
{
    public static void main(String []args)
    {
        ArrayList all=new ArrayList();

        all.add(12);
        all.add(1);
        all.add(8);
        System.out.println(all);

        ArrayList al2=new ArrayList();
        al2.add("HEllo");
        al2.add(1);
        al2.add('d');
        al2.add(1.1);
        System.out.println(al2);

        ArrayList al3 =new ArrayList();

        al3.add(5);

        System.out.println(al3);

        System.out.println("After adding collection into another collection");
        al3.addAll(al2);
        System.out.println(al3);

        al3.add(1,"bhupendra");

        System.out.println(al3);






    }

}

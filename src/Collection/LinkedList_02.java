package Collection;
import java.util.*;
public class LinkedList_02
{
    public static void main(String []args)
    {
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add(333);
        ll1.add(443);
        ll1.add(300);

        System.out.println(ll1);

        System.out.println(ll1.get(1));
        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.getFirst());

        ll1.push(56);
        System.out.println(ll1);

        ll1.pop();
        System.out.println(ll1);
    }
}

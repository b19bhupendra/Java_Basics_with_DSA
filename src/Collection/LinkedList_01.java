package Collection;

import java.util.LinkedList;

public class LinkedList_01
{
    public static void main(String []args)
    {
        LinkedList ll= new LinkedList();
        ll.add(03);
        ll.add("Hey");
        ll.add(43);
        System.out.println(ll);

        LinkedList ll2=new LinkedList();
        ll2.add(233);
        ll2.add(866);
        ll2.add(400);
        System.out.println(ll2);

        LinkedList ll3=new LinkedList();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);


        ll3.addFirst("adding in front");
        ll3.add(2,"Hey");
        System.out.println(ll3);

        System.out.println(ll3.peek());
        System.out.println(ll3);//peak first element dega but list me kkuch effect n krega

        System.out.println(ll3.poll());
        System.out.println(ll3);//ye first ele list se hata k dega
    }
}

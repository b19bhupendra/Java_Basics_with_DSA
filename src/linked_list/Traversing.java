/*
package linked_list;
import java.util.*;
public class Traversing
{
   public static void travese(ListNode head)
   {
       if(head==null)
       {
           return;
       }
       while(head!=null)
       {
           System.out.println(head.getData()+" -->");
           head= head.getNext(); //head k next ko head bana do
       }
   }
   //
    public static void main(String []args)
    {
        ListNode head = new ListNode(1);
        ListNode node1= new ListNode(2);
        ListNode node2= new ListNode(3);
        ListNode node3=new ListNode(4);

        head.setNext(node1);//head will point to one
        node1.setNext(node2);
        node2.setNext(node3);

        travese(head);

    }
}
*/
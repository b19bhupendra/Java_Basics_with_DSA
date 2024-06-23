/* package linked_list;

import java.util.*;

public class Operations
{
    public static ListNode loopStart(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        boolean hasLoop = false;

        ListNode slow=head;
        ListNode fast =head;

        while(fast!=null && fast.getNext()!=null)
        {
            slow = slow.getNext();
            fast=fast.getNext();

            if(slow==fast)
            {
                hasLoop= true;
                break;
            }
        }
        if(!hasLoop)
        {
            System.out.println("This no Loop");
            return null;
        }
        ListNode left =head;
        Listnode right=slow;

        while(leaft!=right)
        {
            left = left.getNext();
            rigth=right.getNext();
        }
        return left;
    }
    public boolean hasLoop(ListNode head)
    {
        if(head == null)
        {
            return false;
        }

        ListNode slow= head;
        ListNode fast= head;

        while(fast!= null && fast.getNext()!= null)
        {

            slow = slow.getNext();
            fast=fast.getNext().getNext();

            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    //finding the length of the node
    public static int length(ListNode head)
    {
        if(head== null)
        {
            return 0;
        }
        int count=0;
        while(head!= null)
        {
            count++;
            head=head.getNext();
        }
        return count;
    }
    public static ListNode insertAtKthPosition(ListNode head, int data,int k) {
        //validate k
        if (k < 0 || k > length(head)) {
            System.out.println("K is not correct");
            return head;
        }
        if (k == 0) {
            //we want to insert at start
            ListNode node = new ListNode(data);
            node.setNext(head);
            head = node;
        }
        else
        {
            //middeele
            Listnode node = new Listnode(data);

            //find the node at k-1th position

            ListNode temp = head;
            int count = 0;
            while (count < k) {
                temp = temp.getNext();
                count++;
            }
            //temp will the node at k-1th index
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        return head;

    }

    public static void main(String []args)
    {

    }


}
*/
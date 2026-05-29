package LinkedList;

public class LinkListExample {

    public static void main(String [] args){

        //Creating a LinkedList
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;

        //Traversing the linkedList and printing values
        System.out.println("Linked List");
        ListNode current = node1;
        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }

        //Adding new node: 15->20->30
        ListNode newNode = new ListNode(15);
        newNode.next = node2;
        node1.next = newNode;
        //Traversing the updated LinkedList
        System.out.println("Updated Linked List");
        current = node1;
        while (current!=null){
            System.out.println(current.val);
            current = current.next;
        }

        //Removing a node: 10->15->30
        node1.next = newNode.next;
        //Traversing the modified linked list
        System.out.println("Modified Linked List");
        current = node1;
        while (current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }

}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

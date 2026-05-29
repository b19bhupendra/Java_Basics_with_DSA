package LinkedList;

import java.util.LinkedList;

public class LinkedListFirst
{
    Node head;
    class Node // In this node class there should be two component i.e data and the pointer
    {   int data;
        Node next;
        Node(int d) // if in this node any one enter the data d then it should go in data and inside next value should be initialised to null
        {
            data = d;
            next = null;
        }
    }
    //Implementation of the insertion
    public void insertAtEnd(int newData)
    {
         Node newNode = new Node(newData);

         //linked list is empty
        if(head == null)
        {
            head = newNode;//new Node(newData);
            return;
        }

        //linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null)
        {
            temp =temp.next;
        }
        temp.next= newNode;
        return;
    }
    //Displaying the linked list
    public void displayLinkedlist()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }
    public static void main(String []args)
    {
        LinkedListFirst llist = new LinkedListFirst();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(4);

        System.out.println("Before insertion of 10");
        llist.displayLinkedlist();
        System.out.println();

        System.out.println("After  insertion of 10");
        llist.displayLinkedlist();
        System.out.println();
        llist.insertAtEnd(4);


    }

}

/*
1. Check if there is a loop in the linked list.
2. If yes then where the loop has started from.
3. Remove loop from the linked list
*/
import java.util.*;

public class LinkedListQuestion
{
    Node head;
    public static Node slow;
    public static Node fast;
    public static Node loopStarting;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void createLoop()
    {
        Node last = head;
        Node start = head;
        while(last.next!=null)
        {
            last=last.next;
        }
        int count=1;
        while(count!=3)
        {
            start=start.next;
            count++;
        }
       last.next=start;
    }
    public boolean hasLoop()
    {
        Node s=head.next;
        Node f=head.next.next;
        while(s!=f && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        if(s==f)
        {
            slow=s;
            fast=f;
            System.out.println("The list is looped.");
            return true;
        }
        System.out.println("The list is not looped.");
        return false;
    }
    public void getLoopStartingAndRemove()
    {
        slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
             fast.next=null;
        }
    public void removeLoop()
    {
       Node temp=loopStarting;
       //Node p=temp;
       while(temp.next!=loopStarting)
       {
           temp=temp.next;
           //System.out.println(p.data);
            //p=temp;
       }
      System.out.println("TEMP: "+temp.data);
       temp.next=null;
    }
    public void traverse()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LinkedListQuestion list = new LinkedListQuestion();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.createLoop();
        list.hasLoop();
        list.getLoopStartingAndRemove();
    
        list.traverse(); 
    }
}
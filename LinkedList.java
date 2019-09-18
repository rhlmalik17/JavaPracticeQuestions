

public class LinkedList
{
    Node head;
     
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next=null;
        }
    }
    public void deleteFirst()
    {
        if(head.next==null && head!=null)
        {
            head=null;
        }
        else
        {
            head=head.next;
        }
    }
   
    public void deleteLast()
    {
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
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
    @Override
    public String toString()
    {
        StringBuffer a = new StringBuffer();
        Node temp = head;
        if(temp!=null)
        {
            while(temp!=null)
            {
                a.append(temp.data+" ");
                temp=temp.next;
            }
        }
        return a.toString();
    }
    public void remove(int index) 
    {
        if(index==this.size()-1)
        {
            this.deleteLast();
        }
      else if(index==0 && this.size()>=1)
      {
          head=head.next;
      }
      else if(index>=this.size() || index<0)
      {
          System.out.println("Array Index out of bounds for length "+index);
      }
      else if(index>=0 && this.size()>0 && index<this.size())
      {
        int count=0;
        Node temp = head;
        while(count!=index-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp.next.next!=null)
        temp.next=temp.next.next;
      }
   
    }

    public int findMiddle()
    {
        Node s=head;
        Node f=head;
 
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s.data;
    }

    public int size()
    {
        int count=0;
        if(head!=null && head.next==null)
        {
            return 1;
        }
        if(head==null)
        {
            return 0;
        }
        if(head.next!=null)
        {
            Node temp = head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
        }
        return count;
    }
    public void addAtBegin(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.findMiddle());
    }
}
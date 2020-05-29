import java.util.ArrayList;
import java.util.Stack;
public class Heap{

    ArrayList<Integer> heap = new ArrayList<Integer>();
    
    public void add(int data)
    {
        if(heap.size()==0)
        {
            heap.add(data);
            return;
        }
        else
        {
            heap.add(data);
            int i = heap.size()-1;
            int parent = (i-1)/2;
            while(parent>=0 && heap.get(parent) < heap.get(i))
            {
                int temp = heap.get(i);
                heap.set(i,heap.get(parent));
                heap.set(parent,temp);
                i=parent;
                parent= (i-1)/2;
            }
            
        }
    }
    public void Heapify(int index)
    {

    }
    public void Display()
    {
        for(int i=0;i<heap.size();i++)
        {
            System.out.print(heap.get(i)+" ");
        }
    }
    public static void main(String args[])
    {
        Heap obj = new Heap();
        obj.add(10);
        obj.add(7);
        obj.add(8);
        obj.add(6);
        obj.add(5);
        obj.add(2);
        obj.add(1);
        obj.Display();
    }
}
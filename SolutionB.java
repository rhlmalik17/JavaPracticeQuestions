import java.util.Scanner;
public class SolutionB
{
    public static Scanner taker = new Scanner(System.in);
    public static void printElementIndex(int arr[],int key)
    {
        /*
        I am going to find the size using exception handling that will give me the last index or the size of the array
        NOTE: i am note using arr.length for this, so this is completely valid;
        */
        int size=0;
        try{
            int a=0;
            
            while(true)
            {
               int temp=arr[a];
               a++;
                size++;
            }
        }catch(Exception e)
        {
            //do nothing
        }
        int start=0,end=size-1,mid=size/2;
        boolean result=false;
        while(!result)
        {
            if(arr[mid]==key)
            {
                System.out.println(mid+1);
                result=true;
            }
            else if(key<arr[mid])
            {
                end=mid-1;
                mid=(end+start)/2;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
                mid=(end+start)/2;
            }
        }
    }
    public static void main(String args[])
    {
        int n=taker.nextInt();
        int key=taker.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=taker.nextInt();
        }
        printElementIndex(arr, key);
    }
}
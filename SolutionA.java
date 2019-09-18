import java.util.Scanner;
public class SolutionA
{
    public static Scanner taker = new Scanner(System.in);
    public static int getSameIndexElement(int arr[])
    {
        try{ 
        int index=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==index)
            {
                return arr[i];
            }
            index++;
        }
    }   
        catch(Exception e)
     {
        System.out.println("Exception Caught Wrong test case!!");
     }
        return 0;
    }
    public static void main(String args[])
    {
        int n = taker.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=taker.nextInt();
        }
        System.out.println(getSameIndexElement(arr));
    }
}
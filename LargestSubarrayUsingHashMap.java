import java.util.HashMap;
public class LargestSubarrayUsingHashMap
{
    //Print num of max sub array with sum 0
    public static void printMaxLength(int arr[])
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum=0;
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {

            sum+=arr[i];
            if(mp.containsKey(sum) || sum==0)
            {
                if(sum==0)
                {
                   
                    max = i+1;
                }else{ 
                int temp=(i-mp.get(sum));
                if(temp>max)
                max=temp;
                }
            }
            else
            {
                mp.put(sum,i);
            }
        }
        System.out.println("Length: "+max);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,-3};
        printMaxLength(arr);
    }
}
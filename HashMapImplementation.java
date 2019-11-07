import java.util.*;

public class HashMapImplementation
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rahul",505);
        map.put("Zeus",69);
        map.put("Forbidden",1769);
        // Set<String> keys = map.keySet();
        // for(String e : keys)
        // {
        //     System.out.print(e+" ");
        // }
            // System.out.println(map.containsKey("Rahul"));
            // System.out.println(map.containsValue(1769));
            int target = 12;
            HashSet<Integer> nums = new HashSet<>();
            nums.add(1);
            nums.add(7);
            nums.add(9);
            nums.add(3);
            nums.add(15);
        
            for(Integer e : nums)
            {
                boolean temp = nums.contains(target-e);
                if(temp){ 
                System.out.println(temp);
                    System.exit(0);
                    break;
                }
            }
            System.out.println(false);
            
            // System.out.println(nums.containsValue());




            // System.out.println("Hashmap : "+hs);
        // HashMap<String,String> map = new HashMap<>();

    }

}
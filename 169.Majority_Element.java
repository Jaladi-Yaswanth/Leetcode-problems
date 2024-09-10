import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {
      int count=0;

      int read=nums[0];

      Map<Integer,Integer> map= new HashMap<>();

      for(int i =0;i<nums.length;i++){
        if(map.containsKey(nums[i])) map.put(nums[i],(map.get(nums[i])+1));

        else map.put(nums[i],1);
      }

     int n=nums.length/2;

      for(Map.Entry<Integer,Integer> mapp : map.entrySet()) {
        if(mapp.getValue()>n) return mapp.getKey();
      }
      
    return 0;
    }
}

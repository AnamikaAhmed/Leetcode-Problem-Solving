package Problem1;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args){
    int[] array = {2,7,11,15};
    int target = 9;
    int[] result = twoSum(array, target);
    System.out.println(result[0]+" "+result[1]);
  }

  public static int[] twoSum(int[] nums, int target){

    HashMap<Integer, Integer> hmap = new HashMap<>();
    int[] result = new int[2];
    for(int i=0; i<nums.length; i++){
      if(hmap.containsKey(target-nums[i])){
        result[0] = hmap.get(target-nums[i]);
        result[1] = i;
      }

     else{
       hmap.put(nums[i],i);
     }
    }
  return result;
  }

}

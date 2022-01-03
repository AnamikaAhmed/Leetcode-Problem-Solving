package Problem217;

import java.util.HashSet;
import java.util.Set;

public class Problem217_Set {
  public static void main(String[] args){
    int[] array = {1,2,3,4};
    System.out.println(containsDuplicate(array));
  }

  public static boolean containsDuplicate(int[] nums) {
    if (nums.length==0 || nums==null) return false;
   Set<Integer> set = new HashSet<>();
   // adding elements to the set
   for(int i=0; i<nums.length; i++){
     set.add(nums[i]);
   }
   if(set.size()==nums.length) return false;
   return true;
  }

}

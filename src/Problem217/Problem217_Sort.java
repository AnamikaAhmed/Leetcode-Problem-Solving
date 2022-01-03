package Problem217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem217_Sort {
  public static void main(String[] args){
    int[] array = {1,2,3,4,1};
    System.out.println(containsDuplicate(array));
  }

  public static boolean containsDuplicate(int[] nums) {
    if (nums.length==0 || nums==null) return false;
    Arrays.sort(nums);
    for(int i=0; i<nums.length-1; i++){
      if(nums[i]==nums[i+1]) return true;
    }
    return false;
  }

}
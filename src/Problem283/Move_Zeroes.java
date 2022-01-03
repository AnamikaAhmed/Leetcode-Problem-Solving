package Problem283;

public class Move_Zeroes {
  public static void main(String[] args){
    int[] nums = {0,1,0,3,12};
    moveZeroes(nums);
    for(int i=0; i<nums.length; i++){
      System.out.println(nums[i]);
    }
  }
  public static void moveZeroes(int[] nums) {
   int front = 0;
   int back = 1;
   while(front<nums.length && back<nums.length){
     if(nums[front]==0 && nums[back]==0){
       back++;
     }
     else if(nums[front]==0 && nums[back]!=0){
       int temp = nums[back];
       nums[back] = 0;
       nums[front] = temp;
       front++;
       back++;
     }
     else{
       front++;
       back++;
     }
   }
  }
}

package Problem567;

import java.util.Arrays;

public class Problem567_SecondPermutationApproach {

  public static void main(String[] args) {
    String s1 = "ab";
    String s2 = "eidbaooo";
    System.out.println(checkInclusion(s1, s2));
  }

  public static boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for(int i=0; i<s1.length(); i++){
      arr1[s1.charAt(i)-'a']++;
      arr2[s2.charAt(i)-'a']++;
    }
    if(matches(arr1,arr2)) return true;
    int front=0;
    int back = s1.length();
    while(back<s2.length()){
      arr2[s2.charAt(front)-'a']--;
      arr2[s2.charAt(back)-'a']++;
      if(matches(arr1,arr2)) {
        return true;
      }
      front++;
      back++;
    }
  return false;
  }
  public static boolean matches(int[] arr1, int[] arr2){
    if(Arrays.equals(arr1,arr2)) return true;
    return false;
  }
}


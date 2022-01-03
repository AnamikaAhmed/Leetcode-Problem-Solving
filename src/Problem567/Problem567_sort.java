package Problem567;

import java.util.Arrays;

public class Problem567_sort {
  public static void main(String[] args){
    String s1 = "ab";
    String s2 = "eidbaooo";
    System.out.println(checkInclusion(s1,s2));
  }
  public static boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
   // first sort s1
   // match the sorted s1 with every sorted s1.length substring of s2
   s1 = sort(s1);
   for(int i=0; i<=s2.length()-s1.length(); i++){

     if(s1.equals(sort(s2.substring(i,i+s1.length())))){
       return true;
     }
   }
   return false;
  }

  public static String sort(String s){
    char[] array = s.toCharArray(); // converting String to character array
    Arrays.sort(array);
    s = new String(array);// converting a character array to a String
    return s;
  }

}

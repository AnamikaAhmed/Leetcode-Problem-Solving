package Problem567;

public class Problem567_Permutation {
  public static void main(String[] args){
    String s1 = "ax";
    String s2 = "eidbaooo";
    System.out.println(checkInclusion(s1,s2));
  }
  public static boolean checkInclusion(String s1, String s2) {
   if(s1.length()>s2.length()) return false;
   int[] s1Array = new int[26];
   int[] s2Array = new int[26];

   // this is gonna be the first window
   for(int i=0; i<s1.length(); i++){
     s1Array[s1.charAt(i)-'a']++;
     s2Array[s2.charAt(i)-'a']++;
   }
   for(int i=0; i<s2.length()-s1.length(); i++){
     // if the two windows are the same, return true;
     if(matches(s1Array,s2Array)) return true;
     s2Array[s2.charAt(i)-'a']--; // changing the window size
     s2Array[s2.charAt(i+s1.length())-'a']++; // changing the window size
   }
   return matches(s1Array,s2Array);
  }

  public static boolean matches(int[] s1, int[] s2){
    // if any one index of the array does not match, return false
    for(int i=0; i<26; i++){
      if(s1[i]!=s2[i]) return false;
    }
    return true;
  }
}

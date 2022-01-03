package Problem242;

import java.util.Arrays;

public class Problem242_frequency {
  public static void main(String[] args){
    String s = "anagram";
    String t = "nagarxm";
    System.out.println(isAnagram(s,t));
  }
  public static boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    int[] array = new int[26];
    // counting the frequency
    for(int i=0; i<s.length(); i++){
      array[s.charAt(i)-'a']++;
      array[t.charAt(i)-'a']--;
    }
    for(int i=0; i<array.length; i++){
      if(array[i]!=0) return false;
    }
    return true;
  }

}

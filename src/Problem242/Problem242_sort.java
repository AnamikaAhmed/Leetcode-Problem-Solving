package Problem242;

import java.util.Arrays;

public class Problem242_sort {
  public static void main(String[] args){
    String s = "anagram";
    String t = "nagaram";
  }
  public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
  return (sort(s).equals(sort(t)));
  }
  public static String sort(String s){
    char[] array = s.toCharArray();
    Arrays.sort(array);
    return new String(array);

  }

}

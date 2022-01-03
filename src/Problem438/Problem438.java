package Problem438;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem438 {

  public static void main(String[] args) {
    String s1 = "abab";
    String s2 = "ab";
    System.out.println(findAnagrams(s2, s1));
  }

  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new LinkedList<>();
    if(p.length()>s.length()) return result;
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for (int i = 0; i < s.length(); i++) {
      arr1[s.charAt(i) - 'a']++;
      arr2[p.charAt(i) - 'a']++;
    }
    if (isAnagram(arr1, arr2)) {
      result.add(0);
    }
    int front = 0;
    int back = s.length();
    while (back < p.length()) {
      arr2[p.charAt(front) - 'a']--;
      arr2[p.charAt(back) - 'a']++;
      front++;
      back++;
      if (isAnagram(arr1, arr2)) result.add(front);
    }
    return result;
  }
  public static boolean isAnagram(int[] arr1, int[] arr2) {
    if (Arrays.equals(arr1, arr2)) {
      return true;
    }
    return false;
  }
}

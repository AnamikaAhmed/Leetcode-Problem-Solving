package Problem796;

public class Problem796_Rotate_String {
  public static void main(String[] args){
    System.out.println(rotateString("abcde","bcdea"));
  }

  public static boolean rotateString(String s, String goal) {
    return s.length()==goal.length() && (goal+goal).contains(s);
  }

}

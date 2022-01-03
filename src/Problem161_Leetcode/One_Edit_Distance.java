package Problem161_Leetcode;

import java.util.Locale;

public class One_Edit_Distance {
  public static void main(String[] args){
    String t = "aDb";
    String s = "aDb";
    System.out.println(isOneEditDistance(s,t));
  }
  public static boolean isOneEditDistance(String s, String t) {
    // if the difference in length of strings is more than 1
    if(Math.abs(s.length()-t.length())>1 || (s.length()==0 && t.length()==0)) return false;
    // if the strings have the same length
    if(s.length()==t.length()){

      int count = 0;
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)!=t.charAt(i)){
          count++;
        }
      }
      if(count==1) return true;
      else return false;
    }
    //if the strings do not have the same length
    else{
      if(t.length()>s.length()){
        for(int i=0; i<s.length(); i++){
          if((s.charAt(i)!=t.charAt(i)) && (t.charAt(i+1)!=s.charAt(i))){
            return false;
          }
        }
      }
      else if(s.length()>t.length()){
        for(int i=0; i<t.length(); i++){
          if((t.charAt(i)!=s.charAt(i)) && (s.charAt(i+1)!=t.charAt(i))){
            return false;
          }
        }
      }
    }
  return true;
  }
}

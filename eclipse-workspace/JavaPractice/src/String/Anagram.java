package String;
import java.util.*;

public class Anagram {
public static boolean isAnagram(String str1,String Str2) {
	 str1= str1.replace("\\s", "").toLowerCase();
	 Str2= Str2.replace("\\s", "").toLowerCase();
	 if(str1.length()!= Str2.length()) {
		 return false;
	 }
	 char[]ch1= str1.toCharArray();
	 char[]ch2= Str2.toCharArray();
	 java.util.Arrays.sort(ch1);
	 java.util.Arrays.sort(ch2);
	  return java.util.Arrays.equals(ch1, ch2);
}
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		System.out.println(s1+"  is anagram with "+s2);

	}

}

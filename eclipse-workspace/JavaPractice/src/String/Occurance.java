package String;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		String Str="javaProgrammingLanguage";
		Map<Character,Integer>charCount= new HashMap<>();
		 for(char ch:Str.toCharArray()){
			 if(charCount.containsKey(ch)) {
				 charCount.put(ch, charCount.getOrDefault(ch,0)+1);	 
				  }
			 else {
				 charCount.put(ch,1);
			 }
		 }
		 System.out.println("Count the occurance:"+charCount);

	}
	
}

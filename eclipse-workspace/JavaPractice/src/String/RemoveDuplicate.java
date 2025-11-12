package String;
import java.util.*;
public class RemoveDuplicate {


	public static void main(String[] args) {
	String str="javaprograming";
	Set<Character>unique= new LinkedHashSet<>();
	StringBuilder result= new StringBuilder();
	 for(char ch:str.toCharArray()) {
		 unique.add(ch);
	 }
	  for(char ch:unique) {
		  result.append(ch);
	  }
	System.out.println("print the string without diplicate: "+result.toString());

	}

}

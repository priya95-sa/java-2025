package String;
import java.util.*;
public class ReverseSenetence {

	public static void main(String[] args) {
		String str="I love India";
		String[]words=str.split(" ");
		StringBuilder result= new StringBuilder();
		 for(int i=words.length-1;i>=0;i--) {
			 result.append(words[i]);
			  if(i!=0) {
				  result.append(" ");
			  }
		 }
System.out.println("revese the setence:  "+result.toString());
	}

}

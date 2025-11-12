package String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharater {

	public static char nonRepeated(String str)  {
	
	Map<Character,Integer>charCount= new HashMap<>();
	 for(char ch:str.toCharArray()){
		 charCount.put(ch, charCount.getOrDefault(ch,0)+1); 
	 }
	 for(char ch:str.toCharArray()){
	 if(charCount.get(ch)==1) {
		 return ch;}
	 }
	 return '\0';
	 }
	
public static void main(String[] args) {
	String str="Automation";
	char result=nonRepeated(str);
	 if(result!='\0') {
		 System.out.println("Nonrepated character found:  "+result);}
	 else {
		 System.out.println("Nonrepated  not character found");
	 }
	 }
}

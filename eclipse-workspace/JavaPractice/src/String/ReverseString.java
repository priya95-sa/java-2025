package String;

public class ReverseString {

	public static void main(String[] args) {
	String Str="madam";
    String temp="";
 for(int i = Str.length()-1;i>=0;i--) {
	 temp= temp+Str.charAt(i);
 }
 System.out.println("print the revese  string :"+temp);
 
 if(Str .equalsIgnoreCase(temp)) {
	 System.out.println("String is palindrome");
 }
 else {
	 System.out.println("String is  not palindrome");
 }
 }
	}



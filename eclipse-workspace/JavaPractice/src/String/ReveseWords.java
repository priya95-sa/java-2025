package String;

public class ReveseWords {

	public static void main(String[] args) {
	String str="Selenium is Automation";
	String[]words=str.split(" ");
	StringBuilder result= new StringBuilder();
	 for(String word:words) {
		 StringBuilder reverse= new StringBuilder(word).reverse();
		 result.append(reverse).append(" ");
	 }
System.out.println("revese word of the senetence:  "+result.toString());
	}

}

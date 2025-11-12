package Arrays;
import java.util.*;

public class SumWithPair {

	public static void main(String[] args) {
	int[]arr= {12,-9,7,-4,5,-2};
	int target=3;
	 for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]+arr[j]==target) {
				  System.out.println(arr[i] + " + " + arr[j] + " = " + target);	 
			 }
		  }
	 }
	 
System.out.println();
	}

}

package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
	int arr[]= {23,25,89,54,78};
	int k=2;
	k= k%arr.length;
	
	int[]rotate=new int[arr.length];
	 for(int i=0;i< arr.length;i++)
	 {
	rotate[(i+k)%arr.length]=arr[i];
	}
	 System.out.println("rotate the array"+Arrays.toString(rotate));
	
	}
}

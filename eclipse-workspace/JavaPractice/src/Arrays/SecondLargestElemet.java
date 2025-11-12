package Arrays;

public class SecondLargestElemet {

	public static void main(String[] args) {
		  int[]arr={11,21,23,89,45,56};
	        
	          int first=Integer.MIN_VALUE;
	         int Second=Integer.MIN_VALUE;
	         
	          for(int i=0;i<arr.length;i++){
	              
	               if(arr[i]>first){
	                   Second=first;
	                   first=arr[i];
	               }
	        else if(arr[i]> Second && arr[i]!= first){
	            Second=arr[i];}
	          }
	     
	                  System.out.println("print the second largest element : "+Second);}

	}



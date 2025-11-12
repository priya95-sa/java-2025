package Arrays;


	import java.util.*;
	public class UniqueElement {
	    public static void main(String[] args) {
	        int[]arr1={1,2,3,4,5,6};
	        int[]arr2={5,6,7,8,9};
	        Set<Integer>set1= new HashSet<>();
	        Set<Integer>common=new HashSet<>();
	         for(int num:arr1){
	             set1.add(num);
	         }
	          for(int num:arr2){
	        if(set1.contains(num)){
	            common.add(num);
	        }
	          }
	        System.out.println("common element from both of the element:"+common); 
	    }
	}




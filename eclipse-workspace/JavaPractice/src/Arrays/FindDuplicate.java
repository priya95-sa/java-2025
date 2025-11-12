package Arrays;

import java.util.*;


public class FindDuplicate {
	public static void main(String[]args) {
			int[]arr= {21,26,21,89,56};
		Set<Integer>unique= new HashSet<>();
		Set<Integer>Duplicate= new HashSet<>();
		 for(int num:arr) {
		if	( !unique.add(num)) {
			Duplicate.add(num);
		 }}
		 System.out.println("print the array with out duplicate:"+Duplicate);
		
	}

}

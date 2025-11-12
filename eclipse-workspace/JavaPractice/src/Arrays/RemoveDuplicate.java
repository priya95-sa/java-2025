package Arrays;
import java.util.*;

public class RemoveDuplicate {
public static void main(String[] args) {
		int[]arr= {21,26,21,89,56};
Set<Integer>unique= new LinkedHashSet<>();
 for(int num:arr) {
	 unique.add(num);
 }
 System.out.println("print the array with out duplicate:"+unique);
	}

}

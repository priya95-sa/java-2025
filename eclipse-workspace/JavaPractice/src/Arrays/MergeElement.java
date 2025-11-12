package Arrays;

import java.util.*;
public class MergeElement {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={5,6,7,8,9};
        Set<Integer>merageset= new HashSet<>();
      
         for(int num:arr1){
         merageset.add(num);  }
          for(int num:arr2){
         merageset.add(num);}
         

      
        System.out.println("common element from both of the arr:"+merageset); 
    }
}

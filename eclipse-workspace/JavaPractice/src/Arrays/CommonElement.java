package Arrays;

import java.util.*;
public class CommonElement {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={5,6,7,8,9};
        Set<Integer>set1= new HashSet<>();
        Set<Integer>set2=new HashSet<>();
         for(int num:arr1){
         set1.add(num);  }
          for(int num:arr2){
         set1.add(num);}
         
    Set<Integer>unique = new HashSet<>(set1);
     for(int num:set2){
         unique.addAll(set2);}
  
    Set<Integer>common =new HashSet<>(set1);  
         for(int num:set2){
         unique.retainAll(set2);}
         
        unique.removeAll(common);
           
      
        System.out.println("common element from both of the arr:"+common); 
    }
}

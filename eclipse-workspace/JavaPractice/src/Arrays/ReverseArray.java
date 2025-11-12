package Arrays;

import java.util.*;
public class ReverseArray{
    public static void main(String[]args){
        int[]arr={11,21,23,89,45,56};
     
        int start=0;
         int end=arr.length-1;
         
               while (start<end){
                   
                  int temp= arr[start];
                  arr[start]=arr[end];
                  arr[end]= temp;
                  start++;
                  end--;
               }
         System.out.println("reverse the array"+Arrays.toString(arr));}
          }
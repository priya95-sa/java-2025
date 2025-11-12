package Arrays;

import java.util.*;
public class BubbleSort{
    public static void main(String[]args){
        int[]arr={83,11,21,23,89,45,56};
         int n=arr.length; 
         boolean swapped;
         
         for(int i=0;i< n-1;i++){
              swapped= false;
              
              for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                       
                int temp =arr[j];
                arr[j] =arr[j+1];
                arr[j+1] =temp;
                swapped= true;
                   }
              }
              if(!swapped){
                  break;
              }
              }
         System.out.println("Sorted array: "+Arrays.toString(arr));
        
    }
          }
          
     
    

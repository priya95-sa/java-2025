package Arrays;
import java.util.*;
public class MoveZeroToEnd{
    public static void main(String[]args){
        int[]arr={1,2,3,0,4,0,6};
        System.out.println("original array");
        printArray(arr);
        
        moveZeroToEnd(arr);
        
        System.out.println("original array");
        printArray(arr);
        
    }
     public static void moveZeroToEnd(int[]arr){
         int count=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i]!=0){
                  arr[count++]=arr[i];}
              }
              while(count<arr.length){
                   arr[count++]=0;}
              }
              public static void printArray(int[]arr){
                  System.out.println(Arrays.toString(arr));}
          }
import java.util.Scanner;
//! find arrays max value by help of recurssion 

public class arrays_max_value_recursion {
     static int sole = -1;
     static int ararys_max(int arr[],int index){
          if (index==arr.length-1) {
               return arr[index];

          }
          if (sole<arr[index]) {
               sole = arr[index];
          }
           ararys_max(arr, index+1);
           return sole;
     }

     static int amax(int arr[],int index){
          if (index == arr.length-1) {
               return arr[index];
          }
          int smallans = amax(arr, index+1);
          // return smallans;
          return Math.max(smallans,arr[index]);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          int arr[] = {10,7,6,98,7};
          System.out.println(ararys_max(arr, 0));

          System.out.println(amax(arr, 0));
     }
}

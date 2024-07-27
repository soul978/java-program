// import java.util.Scanner;

import java.util.Scanner;
public class searching_targets {
     static boolean target(int arr[],int index,int targets){
          //?base case

          if (index==arr.length) {
               return false;
          }
          //self work
          if (arr[index]==targets) {
               return true;
          }

          //recursive work
          return target(arr, index+1, targets);

          //! its return only true or false value becouse it's return type is boolean 

          
          
          // if (target(arr, index+1, targets)==true) {
          //      return true;
          // }
          // else{
          //      return false;
          // }
          
     }
     static int findIndex(int []arr,int index,int target){
          if (index==arr.length) {//! base case
               return -1;
          }
          if (arr[index]==target) {//! selefe work
               return index;
          }
          return findIndex(arr, index+1, target);//! recursive work
     }
     @SuppressWarnings("resource")
     public static void main(String[] args) {          
          Scanner sc = new Scanner(System.in);
          // int arr[] = {4,12,54,14,3,8,6,1};
          System.out.print("Enter the size of the arrays : ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          
          int i =0 ;
          while (i!=arr.length) {
               System.out.print("Enter the eleemnts of the arrays "+i+" : ");
               arr[i] = sc.nextInt();
               i++;
          }
          System.out.print("enter the targets elements in the given arrays : ");
          int targets = sc.nextInt();

          // if (target(arr, 0, targets)) {
          //      System.out.println("yes");
          // }
          // else{
          //      System.out.println("false ");
          // }
          System.out.println("index no : "+findIndex(arr, 0, targets));

     }
}

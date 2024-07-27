//? given the arrays print all its elements by recursively : 

import java.util.Scanner;
@SuppressWarnings("unused")
public class arrays_print {
     @SuppressWarnings("resource")

     //? first methods : 
     static void arays(int arr[],int index){
          Scanner sc = new Scanner(System.in);
          if (index==-1) {
               return;
          }
          arays(arr, index-1);
          System.out.print(arr[index]+" ");
     }

     //!  second methods : 
     static void arrays(int arr[],int index){
          if (index==arr.length) {
               return;
          }
          System.out.print(arr[index]+" ");//!   5
          arrays(arr, index+1);//!    4 3 2 4 5 6
     }

     public static void main(String[] args) {
          @SuppressWarnings("resource")
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the lenth of the arrays : ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          int i = 0;
          
          while (i!=arr.length) {
               System.out.print("Enter the elements of the arrays : ");
               arr[i] = sc.nextInt();
               i++;
          }
          // int arr[] = {5,4,3,2,4,5,6};
          // int a = arr.length-1;
          arays(arr, n-1);
          System.out.println();
          System.out.println("second methods : ");
          arrays(arr, 0);


     }
}

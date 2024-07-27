import java.util.Scanner;

//!========= bubble sort algorithum ===========================

//? it's help to sort the arrays 
public class bubble_sort_assending_order {
     static void sort(int arr[]) {   
          boolean ss = false;
          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                         ss = true;
                    }
                    if (arr[i] < arr[j]) {
                         ss = true;
                    }
               }
          }

          System.out.println("\n");

          System.out.println("Arrays is sorted in assending orders : " + ss);
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
     }

     //todo it's help to check the arrays are sortd or not 
     static void check_sorted_or_not(int[] arr, int index) {
          boolean bool = false;
          if (index == 1) {
               bool = true;
          }

          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                         bool = true;

                    } else {
                         bool = false;

                    }

               }
          }
          if (bool == true) {
               System.out.println("Arrays is sorted  ");
          } else {
               System.out.println("Arrays is not sorted ");
          }
     }
     

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of the arrays  : ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < arr.length; i++) {
               System.out.print("Enter the elements of the given arrays  " + i + " : ");
               arr[i] = sc.nextInt();
          }
          // sort(arr);
          check_sorted_or_not(arr, n);
     }
}
import java.util.Scanner;
public class printarrays_recursivaly {
     static void printarays(int arr[], int b) {
          if (b == arr.length) {
               return;
          }
          System.out.print(arr[b] + " ");
          printarays(arr, b + 1);
     }

     static int max_value(int arr[], int b) {
          if (b == arr.length - 1) {
               // return arr[b];
               return 0;
          }
          int maxs = max_value(arr, b + 1);
          return Math.max(maxs, arr[b]);
     }
     @SuppressWarnings("unused")
     public static void main(String[] args) {
          
          @SuppressWarnings("resource")
          Scanner sc = new Scanner(System.in);
          int arr[] = { 1, 2, 3, 4, 56, 7 };
          printarays(arr, 0);

          System.out.println("\n");
          System.out.println(max_value(arr, 0));
     }
}

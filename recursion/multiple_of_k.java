import java.util.Scanner;

public class multiple_of_k {
     static void sole(int number, int k) {
          // ? base case
          if (k == 0) return;

          
          // ! reccursive work
          sole(number, k - 1);

          // ? self work;
          System.out.println(number * k);

     }

     @SuppressWarnings("resource")
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the n numbers : ");
          int numbers = sc.nextInt();
          System.out.print("Enter the k value : ");
          int k = sc.nextInt();
          sole(numbers, k);
          // sole(numbers, k);

     }
}

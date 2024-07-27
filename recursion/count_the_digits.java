import java.util.Scanner;
@SuppressWarnings("resource")

public class count_the_digits {
     static int counts(int n){
          if (n>0) {
               count++;
               counts(n/10);

          }
          return count;
     }
     static int count = 0;
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the n numbers : ");
          int number  = sc.nextInt();
          System.out.println(counts(number));
          
     }
}

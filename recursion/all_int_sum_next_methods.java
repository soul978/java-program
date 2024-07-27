import java.util.Scanner;

@SuppressWarnings("resource")
public class all_int_sum_next_methods {
     static int sum = 0;
     static int sums(int n){
          if (n>0) {
               sum=sum+n%10;
               sums(n/10);
          }//! second method given in the file managers : 
          return sum;
     }
     public static void main(String[] args) {
          Scanner sole = new Scanner(System.in);
          System.out.print("Enter the n nombers : ");
          int number  = sole.nextInt();
          System.out.println(sums(number));
     }
}

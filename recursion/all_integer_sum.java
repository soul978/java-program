import java.util.Scanner;
public class all_integer_sum {
     static int add_sum(int n ){
          if (n>0 && n<9) {
               return n;
          }
          int small_answers =add_sum(n/10);
          int last_digit = (n%10);
          return small_answers+last_digit;
          
     }
     
     
     // @SuppressWarnings("unused")
     public static void main(String[] args) {
          @SuppressWarnings("resource")
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first numbers : ");
          int number = sc.nextInt();
          System.out.println(add_sum(number));
          
     }
}

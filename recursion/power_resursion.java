import java.util.Scanner;
@SuppressWarnings("resource")
public class power_resursion {
     static int powers_calculate(int numbers ,int powers){
          if (powers==0) {
               return 1;
          }
           return powers_calculate(numbers, powers-1)*numbers;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the n numbers  : ");
          int number  = sc.nextInt();
          System.out.print("Enter the powers : ");
          int powers = sc.nextInt();
     System.out.println(powers_calculate(number, powers)); 
     }
}

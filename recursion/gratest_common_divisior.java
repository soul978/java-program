import java.util.Scanner;
@SuppressWarnings("resource")
public class gratest_common_divisior {
     static int gcd_recursive(int a,int b){
          if (b==0) {
               return a;
          }
           return gcd_recursive(b,a%b);
     }
     static int itrative_methods(int a,int b){
          while (a%b!=0) {
               int rem = a%b;
               a= b;
               b = rem;
               // System.out.println(a+" "+b);
          }
          return b;          
          
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first numbers : ");
          int number_1 = sc.nextInt();
          System.out.print("Enter the second numbers  : ");
          int number_2 = sc.nextInt();
          // System.out.println(itrative_methods(number_1,number_2));
          System.out.println(gcd_recursive(number_1, number_2));
          
     }
}

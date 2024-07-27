import java.util.Scanner;

@SuppressWarnings("resource")
public class n_numbers_sum {
     static int sumof(int n){
          //! alternate sum of the series : 
          if (n==0) {
               return n;
          }
          if (n%2==0) {
               return sumof(n-1)-n;
          }
          return sumof(n-1)+n;
     }
     
     //! sum of the series 
     static int sum(int n){
          if (n==0) {
               return n;
          }
          return sum(n-1)+n;   
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the n numbes : ");
          int numbers = sc.nextInt();
          System.out.println(sum(numbers));
          // System.out.println(sumof(numbers));
     }
}

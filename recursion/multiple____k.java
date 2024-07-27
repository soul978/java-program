import java.util.Scanner;
@SuppressWarnings("resource")
public class multiple____k {
     static void k_term(int numers,int f_term){
          if (f_term==0) {
               return;
          }
          k_term(numers,f_term-1);
          System.out.println(f_term*numers);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter the n numbers : ");
          int num = sc.nextInt();
          System.out.print("Enter the k term : ");
          int k = sc.nextInt();
          k_term(num, k);
     }
}

import java.util.Scanner;

public class print_table {
     static void multiple(int numbers ,int k){
          if (k==0) {
               return;
          }
          multiple(numbers, k-1);
          
          System.out.print(numbers*k+" ");
           
     }
     @SuppressWarnings("resource")
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the numbers : ");
          int number = sc.nextInt();
          System.out.print("how many multiple you wants : ");
          int multiple =  sc.nextInt();
          multiple(number, multiple);
     }
}

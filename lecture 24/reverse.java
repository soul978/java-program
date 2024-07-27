import java.util.Scanner;
public class reverse {
     static void shivam(int a[]){
          System.out.println("enter the first numbers :");
          for (int i = 0; i < a.length; i++) {
               Scanner sc  = new Scanner(System.in);
              a[i] = sc.nextInt();

          }
     }
     static void pr(int a[]){
          for (int i = 0; i < a.length; i++) {
               System.out.print(a[i]+" ");
          }
          
     }
     static void print(int a[]){
          int n = a.length;
          int i = 0;
          int j = n-1;
          while (i<j) {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
               i++;
               j--;
          }
          pr(a);
     }

     public static void main(String[]args){
          System.out.println("enter the arrays size :");
          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
          int a[] = new int[n];
          System.out.println("enter the elements  number :");
          shivam(a);
          print(a);
         
          

     }
}
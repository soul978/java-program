import java.util.Scanner;

public class multiplication {
     static void print(int a[][]) {
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j <a.length; j++) {
                    System.out.print(a[i][j] + " ");
               }
               System.out.println();
          }
     }

     static void result(int a[][], int b[][], int r1, int c1, int r2, int c2) {
          if (c1 != r2) {
               System.out.println("multiplication are not posible try again ");
               return;
          }
          int mul[][] = new int[r1][c2];// ! pahle ka row and second ka column :
          for (int i = 0; i < r1; i++) {
               for (int j = 0; j < c2; j++) {
                    for (int j2 = 0; j2 < c1; j2++) {// ! c1 chalega
                         mul[i][j] = mul[i][j] + a[i][j2] * b[j2][j];
                    }
               }
          }
          System.out.println("multiplication of 2 matrices :");
         print(mul);

     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the row of first matrix :");
          int r1 = sc.nextInt();
          System.out.println("enter the column of the second matrix ");
          int c1 = sc.nextInt();
          System.out.println("enter the elelemts of the first matrix ");
          int arr[][] = new int[r1][c1];
          for (int i = 0; i < r1; i++) {
               for (int j = 0; j < c1; j++) {
                    arr[i][j] = sc.nextInt();
               }
          }
          System.out.println("enter row of matrix 2");
          int r2 = sc.nextInt();
          System.out.println("enter column of matrix 2");
          int c2 = sc.nextInt();
          System.out.println("enter the elements of second matrix :");
          int brr[][] = new int[r2][c2];
          for (int i = 0; i < r2; i++) {
               for (int j = 0; j < c2; j++) {
                    brr[i][j] = sc.nextInt();
               }
          }
          System.out.println("matrix 1");
         print(arr);
          System.out.println("matrix 2");
       print(arr);

          System.out.println();
           result(arr, brr, r1, c1, r2, c2);
     }

}
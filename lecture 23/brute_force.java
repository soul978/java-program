import java.util.Scanner;
//? try run in copy :
public class brute_force {

     static void inputs(int a[][],int r,int c) {
          System.out.println("enter the elemets "+a.length*a.length);
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i <r; i++) {
               for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
               }

          }
     }
     static int findsum(int a[][],int l1,int r1,int l2,int r2){
          int sum = 0;
          for (int i = l1; i <=l2; i++) {
               for (int j = r1; j <=r2; j++) {
                    sum+=a[i][j];
               }
          }
          return sum;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System .in);
          System.out.println("enter the row ");
          int r = sc.nextInt();
          System.out.println("enter the column :");
          int c = sc.nextInt();
          int matrix[][] = new int[r][c];
          inputs(matrix,r,c);
          System.out.println("enter the l1 :");
          int l1 = sc.nextInt();
          System.out.println("enter the r1 :");
          int r1 = sc.nextInt();
          System.out.println("enter the r1 :");
          int l2 = sc.nextInt();
          System.out.println("enter the r2 :");
          int r2 = sc.nextInt();
          
          System.out.println("rectangle sum "+findsum(matrix, l1, r1, l2, r2));

     }
}
//?pending lecture 23 
import java.util.Scanner;
//! it can generated spiral matrix :
public class generate_spiral {
     static int [][] printmatrix(int n) {
          int matrix[][] = new int[n][n];
          int toprow = 0, bottopmrow = n- 1, leftcolumn = 0, rightcolumn = n - 1;
          int curent = 1;
          while (curent < n * n) {
               // !top row >= leftcol to rightcol;
               for (int j = leftcolumn; j <= rightcolumn && curent < n * n; j++) {
                    matrix[toprow][j] = curent++;
                    
               }
               toprow++;

               // ?rightcol >= toprow to bottomrowl
               for (int i = toprow; i <= bottopmrow && curent < n * n; i++) {
                   matrix[i][rightcolumn]= curent++;
                   
               }
               rightcolumn--;

               // ?bottomrow >= rightcol to leftcol
               for (int i = rightcolumn; i >= leftcolumn && curent < n * n; i--) {
                    matrix[bottopmrow][i] =  curent++;
                  
               }
               bottopmrow--;

               // ? leftcol >= bottopm top toprow;
               for (int i = bottopmrow; i >= toprow && curent < n * n; i--) {
                    matrix[i][leftcolumn]= curent++;
                    
               }
               leftcolumn++;
          }
          return matrix;
     }

     static void print(int a[][]) {
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
               }
               System.out.println();
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n");
         int n = sc.nextInt();

         int matrix[][] = printmatrix(n);
         print(matrix);
     }
}

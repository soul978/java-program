import java.util.Scanner;
//? hardest code of dsa :;
public class spiral {
     static void printmatrix(int matrix[][],int r,int c){
          int toprow=0,bottopmrow=r-1,leftcolumn=0,rightcolumn = c-1;
          int totalelemenets = 0;
          while (totalelemenets<r*c) {
               //!top row >= leftcol to rightcol;
               for (int j = leftcolumn; j <=rightcolumn && totalelemenets<r*c; j++) {
                    System.out.print(matrix[toprow][j]+" ");
                    totalelemenets++;
               }
               toprow++;

               //?rightcol >= toprow to bottomrowl
               for (int i = toprow; i <=bottopmrow  && totalelemenets<r*c; i++) {
                    System.out.print(matrix[i][rightcolumn]+" ");
                    totalelemenets++;
               }
               rightcolumn--;

               //?bottomrow >= rightcol to leftcol
               for (int i = rightcolumn; i>=leftcolumn  && totalelemenets<r*c; i--) {
                    System.out.print(matrix[bottopmrow][i]+" ");
                    totalelemenets++;
               }
               bottopmrow--;

               //? leftcol >= bottopm top toprow;
               for (int i = bottopmrow; i >=toprow  && totalelemenets<r*c; i--) {
                    System.out.print(matrix[i][leftcolumn]+" ");
                    totalelemenets++;
               }
               leftcolumn++;
          }
     }
     static void print(int a[][]){
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]+" ");
               }
               System.out.println();
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter number of row ");
          int r = sc.nextInt();
          System.out.println("enter the column ");
          int c = sc.nextInt();
          int matrix[][] = new int[r][c];
          int total = r*c;
          System.out.println("enter the "+total+" value ");
          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
               }
          }
          System.out.println("input matrix");
          print(matrix);

          System.out.println("spiral order ");
          printmatrix(matrix, r, c);
     }
}

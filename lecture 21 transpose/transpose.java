import java.util.Scanner;

public class transpose {
     static void inputs(int a[][]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the elements of the matrix");
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextInt();
               }
          }
     }

     // static int[][] find(int a[][], int r, int c) {
     //      int ans[][] = new int[c][r];
     //      for (int i = 0; i <c; i++) {
     //           for (int j = 0; j <r; j++) {
     //                ans[i][j] = a[j][i];
     //           }
     //      }
     //      return ans;

     // }
     //! second methord without third avariables :
     static void transpose(int a[][],int r,int c){
          for (int i = 0; i < c; i++) {
               for (int j = i; j < r; j++) {//? i likhna pada  kyo ki 0 likne se do baar swaping ho ja raha tha
                    int temp = a[i][j];//?---------------step 1 = i=0,j=1;
                    a[i][j] = a[j][i];//?----------------stem 2 = i=1;j=0;
                    a[j][i] = temp;//?--------------------doubble swaping ho ja raha tha is liye swaping nahi ho raha tha 0 
               }//? 0 rakhne se
          }
     }
     static void prints(int a[][]){
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j]+" ");
               }
               System.out.println();
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the row of matrix :");
          int r = sc.nextInt();
          System.out.println("enter the column of matrix  :");
          int c = sc.nextInt();
          int arr[][] = new int[r][c];
          inputs(arr);
          System.out.println();
          System.out.println("input  matrix ");
          prints(arr);
         System.out.println();
         System.out.println("Transpose matrix :");
         transpose(arr, r, c);
         prints(arr);
       //  int ans[][] = find(arr,r,c);
        // prints(ans);
     }
}

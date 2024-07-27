import java.util.Scanner;

public class addition_matrix {
    static void print(int a[][]){
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int a[][],int b[][],int r,int c,int r2,int c2){
        if (r!=r2 ||c!=c2 ) {
            System.out.println("wrong addition are not posible");
            return;
        }
        int sum[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j]+b[i][j]; 
            }
        }
        print(sum);
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the row of the arrays :");
        int row = ss.nextInt();
        System.out.println("enter the column of the arrays ");
        int column= ss.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("enter the elements of the arryas :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = ss.nextInt();
            }
        }
        System.out.println("");
        System.out.println("enter the row ");
        int r2 = ss.nextInt();
        System.out.println("enter the cloumn :");
        int c2 = ss.nextInt();
        System.out.println("enter the elements of the arays :");
        int brr[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                brr[i][j] = ss.nextInt();
            }
        }
       System.out.println(" matrix 1");
       print(arr);
       System.out.println("matrix 2");
       print(brr);
       System.out.println("resultants ");
        add(arr, brr, row, column, r2, c2);
    }
    
}
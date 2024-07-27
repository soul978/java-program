import java.util.Scanner;

public class d2_arrays {
    static void inputs(int a[][],int r,int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("enter the " + i + j + " elements ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    static int[][] print(int a[][],int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row :");
        int r = sc.nextInt();
        System.out.println("enter the colum of the arrays :");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        inputs(arr,r,c);
        System.out.println();
        print(arr,r,c);
    }
}

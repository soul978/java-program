import java.util.Scanner;

public class sort_arrays {
    static void printArrays(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void swape(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]  = temp;
    }
    static void sortzeroandone(int a[]){
        int n = a.length;
        int zero = 0;
        //!count numbesr of zerose
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0) {
                zero++;
            }
        }

        //! 0 to zero -1: 0, zerose to n-1:1
        
        for (int i = 0; i < a.length; i++) {
            if (i<zero) {
                a[i]  = 0;
                
            }
            else{
                a[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrays :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter "+ n +" elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original arrays :");
        printArrays(arr);
        sortzeroandone(arr);
        System.out.println("sorted arrays :");
        printArrays(arr);
        
    }
}

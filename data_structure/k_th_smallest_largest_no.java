import java.util.Arrays;
import java.util.Scanner;

public class k_th_smallest_largest_no {
    static void kth(){
        @SuppressWarnings("resource")
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements : "+i+" : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("which term you Want : ");
        int term = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i==term-1) {
                System.out.println("kth term is : "+arr[i]);
            }
            
        }
    }
    public static void main(String[] args) {
        kth();
    }
}

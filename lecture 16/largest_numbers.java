import java.util.Arrays;
import java.util.Scanner;
public class largest_numbers {

    static void inputs(int a[], int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the arrays ");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
    }
    static int maximum(int a[]){
        int b = Integer.MIN_VALUE;
        
        //Arrays.sort(a);
        for (int i = 0; i <a.length; i++) {
           if (a[i]>b) {
            b = a[i];
           }
        }
        return b;
    }
    static int findsecondmax(int a[]){
        int mx = maximum(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == mx) {
                a[i] = Integer.MIN_VALUE;
            }
        }
        int findsecondmax = maximum(a);
        return findsecondmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the arrays :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        inputs(arr, n);
        System.out.println("larges number is = "+maximum(arr));
        System.out.println("second largest numbers is = "+findsecondmax(arr));
    }
}

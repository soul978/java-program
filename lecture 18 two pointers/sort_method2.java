import java.util.Scanner;

public class sort_method2 {
    
    static void printArrays(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void sort(int a[],int n){
        int left = 0, right =n-1;
        while (left<right) {
            if (a[left]==1 && a[right]==0) {
                int temp  =a[left];
                a[left] = a[right];
                a[right] = temp;
                left ++;
                right --;
            }
            if (a[left]==0) {
                left++;
            }
            if (a[right]==1) {
                right--;
            }
        }
    }
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arays :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the " + a+" elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("without sort arrays ");
        printArrays(arr);
        sort(arr, a);
        System.out.println("sorted arrays ");
        printArrays(arr);
    }
}

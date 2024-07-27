import java.util.Arrays;
import java.util.Scanner;

public class Arrays_sort {
    @SuppressWarnings("unused")
    static void larget_elements(int arr[]) {
        Arrays.sort(arr);
        int c = arr.length-1;
        int b = -1;
    System.out.println(arr[c]-1);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the " + i + " : ");
            arr[i] = sc.nextInt();

        }
        larget_elements(arr);
    }
}
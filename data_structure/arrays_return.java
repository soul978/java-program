import java.util.Arrays;
import java.util.Scanner;

public class arrays_return {
    static void inputs() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int brr[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elemets " + i + " : ");
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        brr[0] = arr[0];
        brr[1] = arr[size - 1];
        
            System.out.println("Smalles_no : "+brr[0]);
            System.out.println("Bigest_no : "+brr[1]);

    }

    public static void main(String[] args) {
        inputs();
    }
}
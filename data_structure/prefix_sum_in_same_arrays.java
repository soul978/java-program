import java.util.Scanner;

public class prefix_sum_in_same_arrays {
    static void prefix(int arr[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        System.out.print("enter the index no which find prefix sum : ");
        int prefix = sc.nextInt();
        for (int i = 0; i < prefix; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the lements : " + i + " : ");
            arr[i] = sc.nextInt();

        }
        prefix(arr);

    }
}

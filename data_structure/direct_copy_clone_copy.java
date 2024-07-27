import java.util.Scanner;

public class direct_copy_clone_copy {
    static void printarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void change_arrays(int arrys[]) {
        for (int i = 0; i < arrys.length; i++) {
            arrys[i] = 0;
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eenter the size of the arrays ");
        int inputs = sc.nextInt();
        int arr[] = new int[inputs];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of " + i + " : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("orignal arrays : ");
        printarrays(arr);
        int brr[] = arr.clone();
        System.out.println();
        System.out.println("copy arrays : ");
        printarrays(brr);
        System.out.println();
        System.out.println();
        System.out.println();
        arr[1] = 0;
        arr[2] = 0;
        printarrays(brr);
        System.out.println();
        System.out.println();
        System.out.println("orignial arrays : ");
        printarrays(arr);
        System.out.println();
        System.out.print("Change arrays by methods : ");
        change_arrays(brr);
        printarrays(arr);
        System.out.println();
        printarrays(brr);
    }
}

import java.util.Scanner;

public class reverse_in_defrent_arrays {
    static int[] arrays(int arr[]){
        int  n = arr.length;
        int brr[] = new int[n];
        int j = 0;
        // for (int i = n-1; i >=0; i--) {
        //     brr[j++] = arr[i];
        // }
        int i = n-1;
        while (i>=0) {
            brr[j++] = arr[i--];
        }
       return brr;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the " + i + " : ");
            arr[i] = sc.nextInt();

        }
        int[] ans = arrays(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        // arrays(arr);
    }
}

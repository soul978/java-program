import java.util.Scanner;
public class non_decreasing {
    static void answer(int arr[]) {
        int n = arr.length;
        int brr[] = new int[n];
        int k = n-1;
        int i = 0;
        int j = n-1;
        while (i<=j) {
            if (Math.abs(arr[i])>Math.abs(arr[j])) {
                brr[k--] = arr[i]*arr[i];
                i++;
            }
            else{
                brr[k--] = arr[j]*arr[j];
                j--;
            }
        }
        for (int j2 = 0; j2 < brr.length; j2++) {
            System.out.print(brr[j2]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elemets " + i + " : ");
            arr[i] = sc.nextInt();

        }
        answer(arr);

    }
}

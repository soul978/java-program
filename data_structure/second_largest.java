import java.util.Scanner;
@SuppressWarnings("resource")
public class second_largest {


    static int maximum(int arr[]){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) {
                mx=arr[i];
            }
        }
       return mx;
    }
    static int second_max(int arr[]){
        int mx = maximum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = maximum(arr);
        return second_max;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the " + i + " : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("second maximum elemets : "+second_max(arr));
    }
}

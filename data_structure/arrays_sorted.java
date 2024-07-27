import java.util.Scanner;

public class arrays_sorted {
    @SuppressWarnings("resource")
    static void inputs(){
        Scanner sc =  new Scanner( System.in);
        System.out.println("Enter the first numbers : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the elements of the "+i+" : ");
            arr[i] = sc.nextInt();
        }
        ans(arr);
    }
    static void ans(int arr[]){
        // int store = 0;
        boolean s = true;
        for (int i = 1; i < arr.length; i++) {
            // if (store<=arr[i]) {
            //     store = arr[i];
            // }
            // else{
            //     s = false;
            //     break;
            // }
            if (arr[i]<arr[i-1]) {
                s = false;
                break;
            }
        }

        System.out.println(" the shorted list is : " +s);
    }
    public static void main(String[] args) {
        inputs();
    }
}

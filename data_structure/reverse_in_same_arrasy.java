import java.util.Scanner;

public class reverse_in_same_arrasy {
    static void reverse1(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j < arr.length; j++) {
              int a  =arr[i];
              arr[i] = arr[j];
              arr[j] = a;
           }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
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
        reverse1(arr);
    }
}

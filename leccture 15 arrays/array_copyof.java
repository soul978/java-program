import java.util.*;

public class array_copyof {
    static void printarray(int arr[]) {//? print functions which are print the arrays if you call
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        System.out.println("original arrays ");
        printarray(arr);
        int arr_2[] = Arrays.copyOf(arr,3);//! arrays  name and arrays length ;
        // int arr_2[] = new int[5];
        
        System.out.println("copy arrays ");
        printarray(arr_2);

        // ! change some values of arr_2;
        // arr_2[0] = 1;
        // arr_2[1] = 9;
        // System.out.println("original arrays after cahnge arr_2");
        // printarray(arr);
        // System.out.println("copyied arr_2 after changing arr_2");
         // printarray(arr_2);
    }
}

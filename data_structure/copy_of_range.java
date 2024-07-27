import java.util.Arrays;

public class copy_of_range {
    static void print_arrays(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    
    static void changeArrays(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0 ] = 90;
        arr[1 ] = 8;
        arr[2 ] = 3;
        arr[3 ] = 4;
        arr[4 ] = 2;
        arr[5 ] = 7;

        int brr[] =Arrays.copyOfRange(arr, 3,arr.length);
        changeArrays(brr);

        System.out.println("oringal arrays ");
        print_arrays(arr);

        System.out.println("change arrays ");
        print_arrays(brr);


    }
}

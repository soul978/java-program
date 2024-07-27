import java.util.*;

public class arrays_copyofRange {
   static void app(int []zrr){
        for (int i = 0; i < zrr.length; i++) {//? print fuction arrays created to prints the arrays :
            System.out.println(zrr[i]);
        }
        
    }


    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 6;
        arr[1] = 6;
        arr[2] = 0;
        arr[3] = 5;
        arr[4] = 3;
        // System.out.println("print the arrays help of afunctions :");
        // app(arr);

        int arr_2 [] = Arrays.copyOfRange(arr,0,arr.length);
        System.out.println("copy range arrays ");
        app(arr_2);    
    }
}

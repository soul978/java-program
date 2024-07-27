import java.util.Scanner;

public class first_repeat_numbers {
    static void inputs(int a[], int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the arrays ");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
    }
    static int repeat(int a[]){
        int b = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]) {
                   return a[i];//! return stop the all proces :
                   //? its return first repeated numbers 
                   //! b = arr[i]  ---its return last repeating values in the arrays :
                }
                
            }
            
        }
      return -1;//? if answer was not found it return the -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the arrays :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        inputs(arr, a);
        repeat(arr);
       System.out.println(repeat(arr));
    }
}

import java.util.Scanner;
@SuppressWarnings("resource")
public class prifix_sum {

    static void prifix(int array[]){
        
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = array.length;
        int sum = 0;
        
    //    int arr[] = new int[n];
    //   int b = 0;
        System.out.print("Enter the prifix_sum_no : ");
        int sole=  sc.nextInt();
        for (int i = 0; i <sole; i++) {
           array[i]= sum+=array[i];  //?nelp to print the prifix at same arrays ; 
            // System.out.println(sum+" ");
            // arr[b++] = sum;
        }
        // System.out.println("Prefix sum : "+sum);
        for (int i = 0; i <sole; i++) {
          System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            arr[i] = sc.nextInt();
        }
        prifix(arr);
    }
}

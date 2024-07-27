import java.util.Scanner;

public class prefix_suffix_sum {
    static int findsum(int a[]){
        int totalsum= 0;
        for (int i = 0; i < a.length; i++) {
            totalsum+=a[i];

        }
        return totalsum;
    }
    static boolean equalsumpartion(int a[]){
       int totalsum = findsum(a);

       int prefsum = 0;
       for (int i = 0; i < a.length; i++) {
        prefsum += a[i];
        int suffixsum = totalsum -prefsum;
        if (suffixsum  == prefsum) {
            return true;
        }
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  "+n+"elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("equal partion  possibles "+ equalsumpartion(arr));
    }
}

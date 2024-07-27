import java.util.Arrays;
import java.util.Scanner;
public class uniqe {
   
    static void inputs(int a[],int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the arrays ");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
    }
    static int prints(int a[],int x){
       // Scanner sc = new Scanner(System.in);
        int c = -1;
        //Arrays.sort(a);
        for (int i = 0; i < x; i++) {
           for (int j = i+1; j < x; j++) {
              if (a[i]==a[j]) {
                a[i] = -1;
                a[j] = -1;
              }
           }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0) {
              c = a[i];  
            }
        }
        
      return c;
    }
    public static void main(String[] args) {
        
        int arr[] = new int[90];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the arrays :");
        int c= sc.nextInt();
        inputs(arr,c);
        prints(arr,c);
        System.out.println("unique numbers id = "+prints(arr,c));
    }
}
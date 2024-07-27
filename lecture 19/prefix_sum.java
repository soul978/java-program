import java.util.Scanner;

public class prefix_sum {
   
    static void printarrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void inputs(int a[]){
        
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    static int [] prefix(int a[]){
        for (int i = 0; i < a.length; i++) {
           if (i>=1) {
            a[i] = a[i-1]+a[i];
           }
        }
        return (a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers  :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the "+ a +" elements ");
        inputs(arr);//!----------------------- inputs 
        System.out.println("print arrays new one ");
       printarrays(arr);//!------------ print arrays fincation
       System.out.println("new one answers :");
      printarrays(prefix(arr));
    }
}

import java.util.Scanner;
class shivam{
   static void ss(int arr[]){
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the elements of the arrays :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }
    }

   static void soul(int a[],int c){
    //int arrr[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if ((a[i]+a[j])==c) {
                    System.out.println(i +" "+ j); 
                }
            }
        }
   }
}
public class problem1 {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the range of arrays :");
        int n = shivam.nextInt();
        System.out.println("enter the target values :");
        int c = shivam.nextInt();
        int arr[] = new int[n];
        shivam obj = new shivam();
       obj.ss(arr);

       System.out.println("resultant ");

       obj.soul(arr, c);

    }
}

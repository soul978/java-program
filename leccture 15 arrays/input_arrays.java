import java.util.Scanner;
class shivam{
    void ss(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elemts you want in the arrays :");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the arryas :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Entere elments show");
        for (int shivam : arr) {
            System.out.print(shivam+" ");
        }
    }
}
public class input_arrays {
    public static void main(String[] args) {
       shivam objects = new shivam();
       objects.ss();
        
    }
}

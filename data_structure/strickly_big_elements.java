import java.util.Scanner;

public class strickly_big_elements {
    @SuppressWarnings("resource")
    static void strickly_big(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays  : ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the "+i+" : ");
            arr[i] = sc.nextInt();
        }
        big_no(arr);
    }
    static void big_no(int arr[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Searching elements : ");
        int search = sc.nextInt();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (search<arr[i]) {
            //    c = arr[i];
            c++;
            }
        }
       
        System.out.println("total  "+c+" Elements is big ");
        
    }
    public static void main(String[] args) {
        strickly_big();
    }
}

import java.util.Scanner;

public class find_x_howmany_time {
    @SuppressWarnings("resource")
    static void find_numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arrays : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        print_the(arr);
       
    }
    
    static void print_the(int[] a) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the searching numbers : ");
        int x = sc.nextInt();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
           if (x==a[i]) {
            c++;
           }
        }
        System.out.println();
        System.out.println("Resultant is : "+c);
    }

    public static void main(String[] args) {
       find_numbers();
        

    }
}

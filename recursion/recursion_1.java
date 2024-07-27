import java.util.Scanner;

public class recursion_1 {
    static void printincreasing(int n){
        if (n==1) {
            System.out.println(n);
            return ;
        }
        printincreasing(n-1);
        System.out.println(n+" ");
    }

    static void printdecreasing(int n){
        //! base case
        if (n==1) {
            System.out.println(n);
            return ;
        }
        //? self work 
        System.out.print(n+" ");
        printdecreasing(n-1);//! recursive work

    }
     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers  : ");
        int n= sc.nextInt();
        // printincreasing(n);
        printdecreasing(n);
    }
}
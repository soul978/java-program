import java.util.Scanner;

public class reverse_Trangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  numbers :");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            // for (int j = 1; j <= (a+1-i); j++) {//! reverse trangle paterns in the help
            //! of row and column ;
            // System.out.print("*");
            // }
            for (int j = a; j > i; j--) {// ? it is also a reverse patern printing techinique help to print reverse
                                         //? numbers
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class pyramid {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the pyramid numbers : ");
        int row  = sc.nextInt();
        for (int i = 1; i <=row; i++) { //? tribersing the traingle 
            for (int j = 1; j <=row-i; j++) { //! this basically use for printing space 
               System.out.print(" ");
            }
            for (int j = 1; j <2*i; j++) { //? printing stars and 2*i times 
                System.out.print("*");
            }
            for (int j = 1; j <=row-i; j++) { //! use for printing spacess in the pyramid 
                System.out.print(" ");
            }
            System.out.println();
           
        }
    }
}

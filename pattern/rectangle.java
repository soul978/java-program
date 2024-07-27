import java.util.Scanner;

public class rectangle {@SuppressWarnings("resource")
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("enter the pyramid numbers : ");
        int row  = sc.nextInt();
       int j = 1;
        for (int i = 1; i <=row; i++) { //? tribersing the traingle 
            for (j=i; j <=row; j++) { //! this basically use for printing space 
              System.out.print(" "+j);
              
            }
            for (int j2 = 1; j2 <i; j2++) {
                System.out.print(" "+j2);
            }
            
            
            System.out.println();
            
        }


    }
}

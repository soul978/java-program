import java.util.Scanner;

public class up_down_traingle {
    @SuppressWarnings("resource")
static void print_trangle_updown(){
    Scanner  sc = new Scanner(System.in);
    System.out.print("Enter the row : ");
    int row = sc.nextInt();
    
    for (int i = 1; i <=row; i++) {
        for (int j =0; j <=row-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
       
    }
   
    for (int i = 1; i <row; i++) {
        for (int j =0; j <=i; j++) {
            System.out.print(" ");
        }
        for (int j=2;j<=row+row-(i*2);j++) {
            System.out.print("*");
            
        }
        System.out.println();
       
    }
   
   
}    

    public static void main(String[] args) {
       print_trangle_updown();
    }
}

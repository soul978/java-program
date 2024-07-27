import java.util.Scanner;
public class multiple_of5and_7 {
    public static void main(String[] args) {
      //  Scanner shivam = new Scanner(System.in);
      //  System.out.println("enter the first numbers :");
       // int a = shivam.nextInt();
        int a = 1;
        while (true) {
            if (a%5==0 && a%7==0) {
                System.out.println("answerr found "+a);
                break;
            }
            a++;
        }
    }
}

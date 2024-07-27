import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");

        int a = sc.nextInt();
        if (a%5==0 && !(a%3==0)) {
            System.out.println("it is  divisible by 5 and 3 ");
        }
        else{
            //System.out.println("not divisible by 3");
        }
    }
}

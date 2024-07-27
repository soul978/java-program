import java.util.Scanner;
@SuppressWarnings("resource")
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers : ");
        int  shivam = sc.nextInt();
        System.out.println();
        do{
            System.out.print(shivam+" ");
            shivam++;
        }while(shivam<=10);
    }
}

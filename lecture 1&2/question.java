import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the printciple ");
        float p = ss.nextFloat();
        System.out.println("enter the time");
        float t = ss.nextFloat();
        System.out.println("entet the rate:");
        float r = ss.nextFloat();
        float si = (p*t*r)/100;
        System.out.println(si);
    }
}

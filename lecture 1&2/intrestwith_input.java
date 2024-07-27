import java.util.Scanner;
public class intrestwith_input {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int p,r,t;
        float si;
        System.out.println("enter the principle :");
        p = ss.nextInt();
        System.out.println("enter the rate :");
        r = ss.nextInt();
        System.out.println("enter the time :");
        t = ss.nextInt();
        si = (p*r*t)/100;
        System.out.println(+si+" is your intrest rate ");
    }
}

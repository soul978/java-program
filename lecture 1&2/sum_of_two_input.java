import java.util.Scanner;
public class sum_of_two_input {
    public static void main(String[] args){
        int a,b;
        System.out.println("enter the value of a ");
        Scanner s = new Scanner(System.in);
        a =  s.nextInt();
        System.out.println("enter the value of b :");
        b = s.nextInt();//? taking inputs 
        int c = a+b;// todo for addition of two numbers 
        int d = a*b; 
        double e = a/b; //! a and b both area double than it can give exact answer other wise it can't give real value :
        int f = a-b;// todo for addition of two numbers 
        System.out.println("addition :"+c);//? system output
        System.out.println("multiplication :"+d);
        System.out.println("division :"+e);
        System.out.println("subtraction :"+f);
    }    
}

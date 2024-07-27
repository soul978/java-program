import java.util.Scanner;
public class cost_price {
    public static void main(String[] args) {
        
        Scanner sd = new Scanner(System.in);

        System.out.println("enter the cost price :");
        int cost = sd.nextInt();
        System.out.println("enter the sselling price :");
        int selling = sd.nextInt();
        if (cost>selling) {
           int b = cost-selling;
            System.out.println("you are in lose " +b+ " Rs");
        }
        else if (cost==selling) {
            System.out.println("not profts not lost ");
        }
        else{
            int c= selling - cost;
            System.out.println("you are in profits " +c+ " Rs ");
        }
    }
}

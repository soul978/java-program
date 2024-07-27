import java.util.Scanner;
public class whilesss {
    static void svs(int resize ,int moves){
        System.out.println("finally you can sone second stage of the game ");
    }
    static void shivam (int moves,int resize){
        int temp = moves;
        moves = resize;
        resize = temp; System.out.println("a = "+moves +"  "+ "b = "+resize);
        System.out.println("Sucessfully numbers are swape ");

        if (moves + resize == 10) {
            svs(resize,moves);
        }
    }
    static void solder(int x,int y){
        x = 90;
        y = -90;
        int z = x + y;
        int r = x - y;
        var a = 6;
    }
    public static void main(String[] args) {
        Scanner stm = new Scanner(System.in);
        int a;
        System.out.println("Put the first numbers ");
        a = stm.nextInt();
        int b;
        System.out.println("put the second numbers ");
        b = stm.nextInt();
        shivam(a,b);


    }
}

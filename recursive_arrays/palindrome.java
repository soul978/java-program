import java.util.Scanner;

public class palindrome {
     static boolean palidrom(String a,int i,int j){
          if (i>=j) {
               return true;
          }
          return (a.charAt(i)==a.charAt(j)&&palidrom(a, i+1, j-1));
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter the string : ");
          String a = sc.nextLine();
          System.out.println(palidrom(a, 0, a.length()-1));
     }
}

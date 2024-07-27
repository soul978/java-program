import java.util.Scanner;

//! it can reverse the all given string ;
public class reversse_string_palindrom {
     static String reverse(String a,int index){
          if (index==a.length()) {
               return "";
          }
          String smalans = reverse(a, index+1);
          return smalans+a.charAt(index);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Write a String : ");
          String ss = sc.nextLine();

          //! code show the given string are palindrome are not 

          String palindrom = reverse(ss, 0);
          if (palindrom.equals(ss)) {
               System.out.println(ss+"  is Palindrome ");
          }
          else{
               System.out.println(ss+" is not a Palindrome  ");
          }

     }
}

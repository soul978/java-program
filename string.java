import java.util.Scanner;

public class string {
     static void string(){
          Scanner sc = new Scanner(System.in);

          String s = sc.nextLine();
          System.out.println(s.substring(2,6));

          char ch = s.charAt(0);

          System.out.println(ch);// character 

          for (int i = 0; i < s.length(); i++) {
               System.out.println(s.charAt(i));
          }
     }

//! remove all the occurrence of 'a' from string s = "abcax";
     static String b = "";
     static String strings(String a,int index){
          if (index==a.length()) {
               return a;
          }
          if (a.charAt(index)!='a') {
               b+=a.charAt(index);
          }
          strings(a, index+1);
          return b;
     }

     //!---------------or---------------------
     static String method(String ss,int index){
          if (index==ss.length()) {
               return"";
          }
          String smallans  = method(ss, index+1);//
          char ch = ss.charAt(index);
          if (ch!='a') {
               return ch+smallans;
          }
          else{
               return smallans;
          }
     }
     

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter the string : ");
          
          String sole = sc.nextLine();
          System.out.println(strings(sole,0));

          System.out.println(method(sole, 0));
          
     }
}

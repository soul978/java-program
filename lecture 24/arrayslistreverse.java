import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Collections;

public class arrayslistreverse {
     static void reverselist(ArrayList<Integer>List){
          int  i =0,j = List.size() - 1;
          while (i<j) {
               Integer temp = Integer.valueOf(List.get(i));
               List.set(i, List.get(j));
               List.set(j,temp);
               i++;
               j--;
          }    
     }
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          ArrayList<Integer> list = new ArrayList<>();
          list.add(0);
          list.add(22);
          list.add(3);
          list.add(5);
          list.add(20);
          System.out.println("origional list "+list);
         // reverselist(list);
         Collections.reverse(list);
          System.out.println("reverse lsit"+list);

          //! sort the arrayslist in assending order when you write only list
          Collections.sort(list);
          System.out.println("Ascending order "+list);//? assending order print the values :
          Collections.sort(list,Collections.reverseOrder());//?decending orders print the values :
          System.out.println("decending orders "+list);


          ArrayList<String>shi = new ArrayList<>();
          shi.add("welcome");
          shi.add("shivam");
          shi.add("wallah");
          shi.add("ss");
          System.out.println("origional list "+shi);
         // Collections.sort(shi);
         Collections.sort(shi,Collections.reverseOrder());
          System.out.println("shortd lsit "+shi);
          //? shorting kewal alphabets se hola ;
          
     }
}

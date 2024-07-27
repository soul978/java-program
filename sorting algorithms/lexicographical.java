public class lexicographical {
     static void lexios(String arr[]){
          for (int i = 0; i < arr.length; i++) {
               int min = i;
               for (int j = i+1; j < arr.length; j++) {
                    if (arr[j].compareTo(arr[min])<0) {
                         min = j;
                    }
               }
               String tmp = arr[i];
               arr[i] = arr[min];
               arr[min] = tmp;
          }
          
          
     }
     public static void main(String[] args) {
          String lexio[] = {"apaya","lime","watermelon","apple","mango","kiwi"};
          lexios(lexio);
          for (String ss : lexio) {
               System.out.print(ss+" ");
          }
     }
     
}

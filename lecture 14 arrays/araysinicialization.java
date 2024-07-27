class arrays{

    void demoarrays(){

        int [] ages = new int [4];
        // float[] weights = new float[7];
        
         String[] names = new String[4];
          
        ages[0]= 56;
        ages[1] = 65;
        ages[2]= 87;
        ages[3] = 78;

       System.out.println(ages[0]);
       System.out.println(ages[1]);
       System.out.println(ages[2]);
       System.out.println(ages[3]);

        names[0] = "shivam";
        names[1] = "aman";
        names[2] = "soul";
        names[3] = "students";


       System.out.println(names[0]);
       System.out.println(names[1]);
       System.out.println(names[2]);
       System.out.println(names[3]);

        
    }
}
public class araysinicialization {
    public static void main(String[] args) {
      arrays obj1 = new arrays();
     obj1.demoarrays();


    }
}

public class students2 {  //! class name students 
    int rollno; //! this are the methods of the class what to do and what to no do 
    String studnetNamel;

    public static void main(String[] args){

        students2 obj1  = new students2(); //? objects created 
        obj1.rollno =1;
        obj1.studnetNamel = "shivam";
        System.out.println(obj1.rollno); //! printed the objects 
        System.out.println(obj1.studnetNamel); //? print the names of the objects 
    

        //? created the seconds objects of the class;

        students2 onjects = new students2();
        onjects.rollno = 56;
        onjects.studnetNamel = "soul mortal";
        System.out.println(onjects.rollno);
        System.out.println(onjects.studnetNamel);

    }
}


public class practice_car {
    int carnumbers;
    int carid;
    int year;
    String name;



    public static void main(String[] args) {
        practice_car soul = new practice_car();// todo------------creating the first objects of the class
        soul.carnumbers = 10000;
        soul.carid = 50;// ?----------------this are the property of the objects of the class
        soul.year = 2024;
        soul.name = "shivam"; // !----------------------------- soul . is a also a accesor of the soul objects
                              

        // ? creating second objects of the car class ;

        practice_car stm = new practice_car(); // todo--------------------------- created the 2 objects of the class
        stm.carid = 90;
        stm.carnumbers = 50;// !----this are the objects properties of the class
        stm.name = "pikakchu";
        stm.year = 6056;
      
        System.out.println();
        System.out.println("soul card numbers = " + soul.carnumbers);// ? all printing method
        System.out.println("soul carid numbers = " + soul.carid);
        System.out.println("soul year = " + soul.year);
        System.out.println("soul name is = " + soul.name);

        // ! printing the second objects of the class
        System.out.println();
        System.out.println("stm card numbers = " + stm.carnumbers);
        System.out.println("stm carid numbers = " + stm.carid);
        System.out.println("stm year = " + stm.year);
        System.out.println("stm name is = " + stm.name);


        //? second class objected created 
        
        
    }

}
//!-- this is a practice sesions ;
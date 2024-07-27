class sole {
    int shivam;
    String name;

    void shivam() {
        System.out.println(shivam);
        System.out.println(name);
    }

    
}

public class oops {
    public static void main(String[] args) {
        sole obj1 = new sole();
        obj1.shivam = 435;
        obj1.name = "sole";
        System.out.println(obj1.shivam);
        System.out.println(obj1.name);
        System.out.println();
        sole obj2 = new sole();
        System.out.println(obj2.shivam = 54);
        System.out.println(obj2.name = "shivam");
        System.out.println();

        @SuppressWarnings("unused")
        sole sc = new sole();
        obj2.shivam();

        
    }

}

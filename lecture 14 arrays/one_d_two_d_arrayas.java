//import javax.swing.text.StyledEditorKit.ForegroundAction;

class shivam {
//!-----------one dimensional arrays----------------------------
    void crazy() {
        int ages[] = { 1, 2, 3, 4, 5, 5, 5, 8 };

        // ?for (int i = 0; i < 8; i++) {

        // ? System.out.println(ages[i]);
        // ?}
        // ! for (int i = 0; i < ages.length; i++) {
        // ! System.out.println(ages[i]);
        // ! }

        for (int shivam : ages) {//! for each loop
            System.out.println(shivam);
        }

    }

    
//?------------------two dimensional arrays--------------------
    void multi() {
        int arr[][] = { { 56, 43, 6 }, { 5, 6, 7 }, { 7, 5, 6 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);

            }
            System.out.println();
        }
    }
}

public class one_d_two_d_arrayas {
    public static void main(String[] args) {

        array_copyof obj1 = new array_copyof();//todo--------created class objects ----
        // obj1.crazy();
        obj1.multi();//todo   ---- calling the objects elements----------

    }
}

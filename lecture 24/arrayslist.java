import java.util.ArrayList;

public class arrayslist {
  public static void main(String[] args) {
    // ! wrapper classes
    Integer i = Integer.valueOf(4);// ? this is object orinted code;
    System.out.println(i);
    Float f = Float.valueOf(4.5f);
    System.out.println(f);

    // ArrayList<Boolean> l2 = new ArrayList<>();
    // ArrayList<Float> l3= new ArrayList<>();
    // todo-----------------------------------------------------
    ArrayList<Integer> l1 = new ArrayList<>();

    // ! add new elements

    l1.add(4);
    l1.add(7);
    l1.add(67);
    l1.add(90);
    l1.add(789);

    // System.out.println(l1.get(0));
    // System.out.println(l1.get(1));
    // System.out.println(l1.get(2));
    // System.out.println(l1.get(3));
    // System.out.println(l1.get(4));
    // todo---------------------------------------------------------------
    // !------ help of loop printing without

    // for (int j = 0; j < l1.size(); j++) {
    // System.out.println(l1.get(j));
    // }

    // todo---------------------------------------------------
    // !----printing th earrays list directly

    System.out.println("print directly :");
    System.out.println(l1);

    // !----adding the elements at some index i---
    l1.add(1, 100);
    System.out.println(l1);

    // ? modifiying elements at index i
    l1.set(1, 2);
    System.out.println(l1);

    // ? remove any elements at index i
    l1.remove(1);
    System.out.println(l1);

    // !--- removing any element to help of value
    System.out.println(l1.remove(Integer.valueOf(10)));
    System.out.println(l1);

    // ! checking if an elements exist
    boolean ans = l1.contains(Integer.valueOf(4));
    System.out.println(ans);

    //?if you don't specify class ,you can put anythinf inside  l

   

  }
}

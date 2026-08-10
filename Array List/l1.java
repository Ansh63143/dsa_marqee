// package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class l1 {
    public static void main(String[] args) {
        // Array List
        // 1. Interface
        List<Integer> l1 = new ArrayList<>();
        // 2.
        ArrayList<String> l2 = new ArrayList<>();

        // 0 based indexing
        // list.size(); --> length

        // Adding Element in ArrayList
      	l1.add(1); // append at the end of list

        // Adding Elements at the specific index
        l2.add("For");

        // Updating value at index 0
        l2.set(0, "GFG");

        // For matrix representation :
        List<List<Integer>> li = new ArrayList<>(); // 2D
        li.add(new ArrayList<>()); // create first row
        // 1st row
        li.get(0).add(0);
        li.get(0).add(12);
        li.get(0).add(11);

        System.out.println(li);

        // for 2nd row
        // li.add(new ArrayList<>());
        // li.get(1).add(11);
        // li.get(1).add(14);
        // li.get(1).add(15);
        // li.get(1).get(1); // [1,1]-> index


    }
}
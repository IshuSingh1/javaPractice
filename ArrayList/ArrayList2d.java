package ArrayList;
import java.util.ArrayList;
public class ArrayList2d {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> list = new ArrayList();
        list.add("pasta");
        list.add("donuts");
        list.add("bread");
        //System.out.println(list);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("tomato");
        list2.add("cabbage");
        list2.add("carrot");
        //System.out.println(list2);

        groceryList.add(list);
        groceryList.add(list2);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
    }
}

package ArrayofObjects;

public class Main {
    public static void main(String[] args) {
        //Food[] list = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("bread");
        Food food3 = new Food("juice");

        Food[] list = {food1, food2, food3};
        list[0] = food1;
        list[1] = food2;
        list[2] = food3;

        System.out.println(list[1].name);

    }
}

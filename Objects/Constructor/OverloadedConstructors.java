package Objects.Constructor;

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("italian", "tomato", "mozzerolla", "olives");
        Pizza pizza2 = new Pizza("italian", "tomato", "mozzerolla");
        Pizza pizza3 = new Pizza("italian", "tomato");
        Pizza pizza4 = new Pizza("italian");
        Pizza pizza5 = new Pizza();

        System.out.println(pizza);
        System.out.println(pizza.toString());
    }
}

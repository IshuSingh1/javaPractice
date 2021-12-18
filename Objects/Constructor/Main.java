package Objects.Constructor;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ishu", 22, 118);
        Human human2 = new Human("uhsi", 22, 811);
        System.out.println(human.name);
        System.out.println(human2.name);
        human2.eat();
        human.drink();
    }
}

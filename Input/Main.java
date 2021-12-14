package Input;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What do you like?");
        String like = scanner.nextLine();
        System.out.println("Hello, "+ name + ".\nYou are "+age+" years old.\nYou like "+like);
        scanner.close();
    }
}
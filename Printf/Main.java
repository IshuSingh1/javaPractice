package Printf;

public class Main {
    public static void main(String[] args) {

        // %[flags][precision][width][conversion-character]

        boolean bool = true;
        char c = '@';
        String str = "Ishu";
        int myInt = 50;
        double myDouble = 1000.00000;

        System.out.printf("This is a formal %b string",bool);
        System.out.println();
        System.out.printf("Name: %10s yes", str); //Width
        System.out.println();
        System.out.printf("Name: %-10s yes", str); //Flags
        System.out.println();
        System.out.printf("Double: %.2f", myDouble);//Precision
        System.out.println();
        System.out.printf("Name: %10s yes", str);
    }
}

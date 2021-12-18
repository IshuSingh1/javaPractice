package WrapperClass;

public class Main {
    public static void main(String[] args) {
        // autoboxing - automatic primitive to wrapper conversion
        Integer a = 123;
        Boolean b = true;
        Character c = '@';
        Double d = 3.14;
        String e = "String";

        // Unboxing - automatic wrapper to primitive conversion
        if(b==true){
            System.out.println("This is true");
        }
    }
}

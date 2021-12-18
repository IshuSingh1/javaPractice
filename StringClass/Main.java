package StringClass;

public class Main {
    public static void main(String[] args) {
        String name = "Ishu";

        //boolean match = name.equals("ishu");
        //boolean match = name.equalsIgnoreCase("ishu");
        //int length = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("I");
        //boolean isEmpty = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('u', 'i');
        System.out.println(result);
    }
}

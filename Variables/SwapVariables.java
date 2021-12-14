package Variables;

public class SwapVariables {
    public static void main(String[] args) {
        String x = "college";
        String y = "job";
        System.out.println(x + "," + y);
        String temp = "";
        temp = x;
        x = y;
        y = temp;
        System.out.println(x + "," + y);
    }
}

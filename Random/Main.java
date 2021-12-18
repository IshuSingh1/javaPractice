package Random;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6);
        System.out.println(x+1);;

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}

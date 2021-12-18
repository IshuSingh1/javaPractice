package Objects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);

        car.drive();
        car.brake();

        Car car2 = new Car(); 
        car2.drive();
    }
    
}

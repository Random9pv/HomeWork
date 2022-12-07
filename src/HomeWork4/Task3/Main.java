package HomeWork4.Task3;

public class Main {
    public static void main(String[] args) {
        CarShop carShop= new CarShop(new Car(5000));
        carShop.dekorator();
    }
}

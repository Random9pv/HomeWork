package HomeWork4.Task3;

public class Car {
    double price;
    public Car(double price ) {
        this.price = price;
    }

    public double getPrice() throws Exception {
        if (price<0) {
            throw new Exception("Цена авто меньше нуля");

        }

        return price;
    }
}

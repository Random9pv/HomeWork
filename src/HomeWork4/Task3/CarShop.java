package HomeWork4.Task3;

public class CarShop {
    Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public String getPriceCar() {
        return " Здравствуй клиент, цена этого авто ";
    }

    public String hasAvto() {
        return " Хочешь купить это авто ? ";
    }

    public String nowInformation() {
        return " Неизвестна  мне  ";
    }

    public String nextAvto() {
        return " Давайте посмотрим другое авто?  ";
    }

    public void dekorator() {
        try {
            System.out.println(getPriceCar() + car.getPrice() + "\n" + hasAvto());

        } catch (Exception a) {
            System.out.println(getPriceCar() + "\n" + nowInformation() + "\n" + nextAvto());

        }

    }

}

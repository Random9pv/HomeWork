package HomeWork3.Task2;

public class Ferrari {
    //Задание №2
    //Создать два класса машин, создать 4 экземпляра и положить их в один массив
    String model;
    String color;

    Ferrari(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return model + " " + color;
    }

}

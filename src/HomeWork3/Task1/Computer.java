package HomeWork3.Task1;

public class Computer extends Electronic {

    public void loadSystem() {
        if (condition == true) {
            System.out.println("загрузка компьютера");
        } else {
            System.out.println("Включите компьютер ");
        }
    }

    @Override
    public void  work() {
        if (condition == true) {
            System.out.println("выполняет вычисление");

        } else {
            System.out.println("Включите компьютер ");
        }
    }
}

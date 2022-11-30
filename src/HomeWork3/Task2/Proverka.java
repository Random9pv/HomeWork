package HomeWork3.Task2;

public class Proverka {
    public static void main(String[] args) {

        Ferrari ferrari1 = new Ferrari("Amerika", "Красный");
        Ferrari ferrari2 = new Ferrari("А125", "синий");

        Ford ford1 = new Ford("Fokus", "черный");
        Ford ford2 = new Ford("Fusion", "желтый");
        Object[] modeliAvto = {ferrari1, ferrari2, ford1, ford2};

        for (Object x : modeliAvto) {
            System.out.println(x);
        }
    }
}

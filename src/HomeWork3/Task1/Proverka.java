package HomeWork3.Task1;

public class Proverka {
    public static void main(String[] args) {

        Computer comp = new Computer();
        LenovoComputer lenovoComputer = new LenovoComputer();
        comp.loadSystem();
        lenovoComputer.loadSystem();
        comp.work();
        comp.of();
    }
}

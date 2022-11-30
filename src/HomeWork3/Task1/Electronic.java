package HomeWork3.Task1;

public abstract class Electronic {

    public void on() {
        System.out.println("включает электрический прибор");

    }

    public void of() {
        System.out.println("выключает электрический прибор");

    }

    public abstract void work();
}

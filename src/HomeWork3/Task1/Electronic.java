package HomeWork3.Task1;

public abstract class Electronic {

    static boolean condition = false;

    public void on() {
        System.out.println("включает электрический прибор");
        condition = true;

    }

    public void of() {
        if (condition == true) {
            System.out.println("выключает электрический прибор");
            condition = false;
        } else {
            System.out.println("компьютер выключен ");
        }
    }
    public abstract void  work();


}

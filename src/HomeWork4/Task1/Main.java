package HomeWork4.Task1;

public class Main {
    public static void main(String[] args) {

        Duck fl1 = new Duck(false);
        Duck fl2 = new Duck(true);
        Airplane airplane1 = new Airplane(-1);
        Airplane airplane2 = new Airplane(77);
        Fly[] fly = {fl1, fl2, airplane1, airplane2};

        for (Fly x : fly) {
            x.inFly();
        }

    }
}

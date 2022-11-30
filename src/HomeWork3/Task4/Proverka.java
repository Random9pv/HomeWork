package HomeWork3.Task4;

public class Proverka {

    public static void main(String[] args) {
        Rabotnik rabotnik1 = new Rabotnik("Алексей");
        Rabotnik rabotnik2 = new Rabotnik("Алекcандр");
        Rabotnik rabotnik3 = new Rabotnik("Михаил");


        Rabotnik[] rabotnik = {rabotnik1, rabotnik2, rabotnik3, rabotnik3};

        for (Rabotnik sklad : rabotnik) {
            sklad.actionRabotnik();
        }

        System.out.println(rabotnik1.name + " испортил " + rabotnik1.getCountRabotnik() + " водки");
        System.out.println(rabotnik2.name + " испортил " + rabotnik2.getCountRabotnik() + " водки");
        System.out.println(rabotnik3.name + " испортил " + rabotnik3.getCountRabotnik() + " водки");

    }
}

package HomeWork3.Task4;

public class Rabotnik extends Sklad {

    String name;
    int countRabotnik = 0;


    Rabotnik(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void actionRabotnik() {
        if (vodka > 0) {
            vodka--;

            System.out.println("Работник " + name + " Ура, я испортил водку");
            countRabotnik++;
            System.out.println("количество испорченного товара в журнале = " + " " + countRabotnik);
            System.out.println("Осталось на складе" + " " + vodka);
        } else System.out.println("водка кончилась");
    }



    public int getCountRabotnik() {
        return countRabotnik;
    }



}

package HomeWork5.Task4;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        profitPyaterochka();
        outComesfullShops();
    }
    public static void profitPyaterochka() throws IOException {String addressPath =
            "C:\\Users\\Пк\\IdeaProjects\\Lesson\\src\\HomeWork5\\Task4\\path\\";
        File file = new File(addressPath);
        String[] cn = file.list();
        double incomes = 0;
        double outcomes = 0;
        double pribul = 0;
        double pribulSum = 0;
        for (int i = 0; i < cn.length; i++) {
            try (BufferedReader bufferedReader1 = new BufferedReader(
                    new FileReader(addressPath + cn[i]));) {
                String line;
                while (bufferedReader1.ready()) {
                    line = bufferedReader1.readLine();
                    String[] line1 = line.split(";");
                    if (line1[0].equals("pyterochka")) {
                        incomes = Double.parseDouble(line1[1]);
                        outcomes = Double.parseDouble(line1[2]);
                        pribul = incomes - outcomes;
                        pribulSum += pribul;
                    }
                }

                System.out.println(cn[i] + " =" + " " + pribulSum);
            }
        }

    }

    public static void outComesfullShops() throws IOException {String addressPath =
            "C:\\Users\\Пк\\IdeaProjects\\Lesson\\src\\HomeWork5\\Task4\\path\\";
        File file = new File(addressPath);
        String[] cn = file.list();
        double outcomesShopPyaterochka= 0;
        double outcomesSumShopPyaterochka = 0;
        double outcomesShopPerekrestok= 0;
        double outcomesSumShopPerekrestok = 0;
        double outcomesShopYdoma= 0;
        double outcomesSumShopYdoma = 0;
        double outcomesShopOkey= 0;
        double outcomesSumShopOkey = 0;
        for (int i = 0; i < cn.length; i++) {
            try (BufferedReader bufferedReader1 = new BufferedReader(
                    new FileReader(addressPath + cn[i]));) {
                String line;
                while (bufferedReader1.ready()) {
                    line = bufferedReader1.readLine();
                    String[] line1 = line.split(";");
                    if (line1[0].equals("pyterochka")) {
                        outcomesShopPyaterochka = Double.parseDouble(line1[2]);
                    }
                    outcomesSumShopPyaterochka+=outcomesShopPyaterochka;
                    if (line1[0].equals("perekrestok")) {
                        outcomesShopPerekrestok = Double.parseDouble(line1[2]);
                    }
                    outcomesSumShopPerekrestok+=outcomesShopPerekrestok;

                    if (line1[0].equals("ydoma")) {
                        outcomesShopYdoma = Double.parseDouble(line1[2]);
                    }
                    outcomesSumShopYdoma+=outcomesShopYdoma;

                    if (line1[0].equals("okey")) {
                        outcomesShopOkey = Double.parseDouble(line1[2]);
                    }
                    outcomesSumShopOkey+=outcomesShopOkey;
                }
            }
        }
        System.out.println("Расходы pyterochka за весь период = " + outcomesSumShopPyaterochka);
        System.out.println("Расходы перекресток за весь период = " + outcomesSumShopPerekrestok);
        System.out.println("Расходы ydoma за весь период = " + outcomesSumShopYdoma);
        System.out.println("Расходы okey за весь период = " + outcomesSumShopOkey);
    }
}


package HomeWork5.Task3;

import java.io.*;
import java.util.Random;

public class FinancialRecord {
    int incomes;
    int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutComes() {
        return outcomes;
    }

    public void setOutComes(int outcomes) {
        this.outcomes = outcomes;
    }

    public static void main(String[] args) throws IOException {
        int incomes = 0;
        int outcomes = 0;
        String line = "C:\\Users\\Пк\\IdeaProjects\\Lesson\\src\\HomeWork5\\Task3\\report_2.txt";
        //создаем и записываем отчеты в файл
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(line));) {
            for (int i = 1; i < 11; i++) {
                incomes = randomNumber();
                outcomes = randomNumber();
                writerReport(bufferedWriter, new FinancialRecord(incomes, outcomes));
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(line));) {
            readerReport(bufferedReader);
        }

    }

    //записать данные в отчет
    public static void writerReport(BufferedWriter bufferedWriter, FinancialRecord financialRecord) throws IOException {
        bufferedWriter.write(financialRecord.getIncomes() + ";" +
                financialRecord.getOutComes() + '\n');

    }

    //суммируем доход и расход по всем отчетам
    public static void readerReport(BufferedReader bufferedReader) throws IOException {
        int SumIncomes = 0;
        int SumOutComes = 0;
        while (bufferedReader.ready()) {
            String line0 = bufferedReader.readLine();
            String[] line2 = line0.split(";");
            int incomes = Integer.parseInt(line2[0]);
            int outcomes = Integer.parseInt(line2[1]);
            SumIncomes += incomes;
            SumOutComes += outcomes;
        }
        System.out.println("Общие доходы = " + SumIncomes + " " +"Общие расходы = " + SumOutComes);

    }

    //получаем рандомные числа
    public static int randomNumber() {
        Random random1 = new Random();
        int i = random1.nextInt(1000);
        return i;
    }


}

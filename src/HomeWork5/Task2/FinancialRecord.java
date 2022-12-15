package HomeWork5.Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FinancialRecord {
    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(double outcomes) {
        this.outcomes = outcomes;
    }

    double incomes;
    double outcomes;

    public FinancialRecord(double incomes, double outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public static void main(String[] args) throws IOException {
        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        String line = "C:\\Users\\Пк\\IdeaProjects\\Lesson\\src\\HomeWork5\\Task2\\report.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(line));) {


            bufferedWriter.write("Доходы = " + " " + financialRecord.getIncomes() + '\n');
            bufferedWriter.write("Расходы = " + " " + financialRecord.getOutcomes() + '\n');
        }
    }
}

package HomeWork2;

public class task4 {
    public static void main(String[] args) {
        double predel = 1_000_000;
        double result = 0;
        int iterationСount = 0;
        double increment = 0.01123;
        int n = 1;
        System.out.println("Начальное число = " + " " + increment);

        for (increment = 0.01123; increment <= 1_000_001; increment += n) {
            if (n < 0) {
                System.out.println("Число отрицательное");
                break;
            }
            result += increment;
            iterationСount++;
            if (result > predel) {
                System.out.println("Дошли  до миллиона прибавля положительное число" + " " + n
                        + " " + " " + " количество итераций =" + " " + (iterationСount - 1));
                break;
            }

        }

    }
}
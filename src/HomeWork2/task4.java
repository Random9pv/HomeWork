package HomeWork2;

public class task4 {
    public static void main(String[] args) {
        double predel = 1_000_000;
        double predelZnak = 1_000_010;
        double result = 0;
        int iteration_count = 0;
        double increment = 0.01123;
        int n = 1;
        System.out.println("Начальное число = " + " " + increment);

        for (increment = 0.01123; increment <= predelZnak; increment += n) {
            if (n < 0) {
                System.out.println("Число отрицательное");
                break;
            }
            result += increment;
            iteration_count++;
            if (result > predel) {
                System.out.println("Дошли  до миллиона прибавля положительное число" + " " + n
                        + " " + " " + " количество итераций =" + " " + (iteration_count - 1));
                break;
            }

        }

    }
}
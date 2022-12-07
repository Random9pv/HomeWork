package HomeWork4.Task2;

public class Main {
    public static void main(String[] args) {
        Watch watch1 = new Watch(true);
        Watch watch2 = new Watch(false);
        Employee employee1 = new Employee(watch1);
        Employee employee2 = new Employee(watch2);
        Score scores1 = new Score(employee1);
        Score scores2 = new Score(employee2);
        Employee[] employees = {employee1, employee2};
        Score[] score = {scores1, scores2};
        Brand brand = new Brand(score);

        brand.score[0].employee.watch.TicTac();
        brand.score[1].employee.watch.TicTac();

    }
}

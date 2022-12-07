package HomeWork4.Task1;

public class Airplane implements Fly {

    public int countPassengers = 0;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {

        return countPassengers;
    }

    @Override
    public void inFly() {
        try {
            if (countPassengers <= 0) {
                throw new FlyException("");
            }
        } catch (FlyException e) {
            System.out.println(e.getMessage1());

        }

        if (getCountPassengers() > 0) {
            System.out.println("Самолет летит");
        }

    }

}

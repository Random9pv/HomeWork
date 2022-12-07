package HomeWork4.Task2;

public class Watch implements TikTac {
    boolean clockBroken;

    public Watch(boolean clockBroken) {
        this.clockBroken = clockBroken;
    }

    @Override
    public void TicTac() {
        try {
            if (clockBroken == true) {
                throw new WatchBrokenError();
            }
        } catch (WatchBrokenError e) {
            System.out.println(e.getMessage());
        }

        if (clockBroken != true) {

            System.out.println("часы работают");
        }


    }
}

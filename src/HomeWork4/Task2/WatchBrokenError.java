package HomeWork4.Task2;

public class WatchBrokenError extends Exception {
    public WatchBrokenError() {
    }


    public String getMessage() {

        return "часы сломаны";
    }
}

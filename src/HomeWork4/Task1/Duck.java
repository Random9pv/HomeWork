package HomeWork4.Task1;

public class Duck implements Fly {
    boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    @Override
    public void inFly() {
        try {
            if (isInjured) {
                throw new FlyException("");
            }
        } catch (FlyException e) {
            System.out.println(e.getMessage());

        }
        if (!isInjured() != true) System.out.println("Утка летит");
    }

}

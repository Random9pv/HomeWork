package HomeWork3.Task3;

public class El  extends Tree implements AbilitySmell{

    @Override
    public void abilitySmell() {
        System.out.println("ель умеет пахнуть");

    }
    @Override
    public void hasBumps() {
        System.out.println("ель имеет шишки");


    }
}

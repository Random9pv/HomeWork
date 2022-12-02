package HomeWork3.Task3;

public class Roza extends Plants implements AbilitySmell, AbilityBloom{

    public void abilitySmell() {
        System.out.println("Роза умеет пахнуть");

    }

    @Override
    public void abilityBloom() {
        System.out.println("Роза умеет цвести");

    }
}

package ss;

public class AFactory extends Factory{

    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}

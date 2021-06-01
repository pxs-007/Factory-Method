package ss;

public class BFactory extends Factory{
    @Override
    public Fruit createFruit() {
        return new Banana();
    }
}

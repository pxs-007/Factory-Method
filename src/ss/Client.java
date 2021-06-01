package ss;

public class Client {
    public static void main (String[] args){
        Factory factory=new AFactory();
        Fruit fruit=factory.createFruit();
        fruit.eat();
    }
}

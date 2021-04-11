package pr6.factoryMethod;

public class ConcreteCreator extends Creator{

    public ConcreteCreator(String name) {
        super(name);
    }

    public ConcreteProduct factoryMethod(String title, String text, int duration){
        return super.factoryMethod(title, text, duration);
    }
}

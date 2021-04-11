package pr6.abstractFactory;

public class ConcreteFactory implements AbstractFactory{
    private String name;

    public ConcreteFactory(String name) {
        this.name = name;
    }

    @Override
    public ConcreteProduct createProduct(String title, String text, int duration) {
        return new ConcreteProduct(title, text, duration, name);
    }
}

package pr6.abstractFactory;

public interface AbstractFactory {
    ConcreteProduct createProduct(String title, String text, int duration);
}

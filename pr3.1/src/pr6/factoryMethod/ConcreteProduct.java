package pr6.factoryMethod;

public class ConcreteProduct implements Product{
    private String title;
    private String text;
    private int duration;
    private String author;

    public ConcreteProduct(String title, String text, int duration, String author) {
        this.title = title;
        this.text = text;
        this.duration = duration;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getDuration() {
        return duration;
    }
}

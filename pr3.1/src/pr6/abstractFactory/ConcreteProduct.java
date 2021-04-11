package pr6.abstractFactory;

import java.text.DecimalFormat;

public class ConcreteProduct implements AbstractProduct {
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

    public void view(){
        System.out.println(author + " - " + this.title + "\n----------\n" + this.text + "\n(" + (int)(this.duration/60) + ":" + new DecimalFormat( "00" ).format((int)(this.duration%60)) + ")");
    }
}

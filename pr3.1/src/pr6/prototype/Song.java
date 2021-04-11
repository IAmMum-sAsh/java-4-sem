package pr6.prototype;

import java.text.DecimalFormat;

public class Song implements Prototype{
    private String title;
    private String text;
    private int duration;
    private String author;

    public Song(String title, String text, int duration, String author) {
        this.title = title;
        this.text = text;
        this.duration = duration;
        this.author = author;
    }

    Song(Song target){
        if (target != null) {
            this.title = target.getTitle();
            this.text = target.getText();
            this.duration = target.getDuration();
            this.author = target.getAuthor();
        }
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

    public String getAuthor() {
        return author;
    }

    @Override
    public Prototype clone() {
        return new Song(this);
    }

    @Override
    public void view() {
        System.out.println(author + " - " + this.title + "\n----------\n" + this.text + "\n(" + (int)(this.duration/60) + ":" + new DecimalFormat( "00" ).format((int)(this.duration%60)) + ")");
    }
}

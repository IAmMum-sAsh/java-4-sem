package pr6.builder;

import java.text.DecimalFormat;

public class Song {
    private final String title;
    private final String text;
    private final int duration;
    private final String author;

    public Song(String title, String text, int duration, String author) {
        this.title = title;
        this.text = text;
        this.duration = duration;
        this.author = author;
    }

    public void view(){
        System.out.println(author + " - " + this.title + "\n----------\n" + this.text + "\n(" + (int)(this.duration/60) + ":" + new DecimalFormat( "00" ).format((int)(this.duration%60)) + ")");
    }
}

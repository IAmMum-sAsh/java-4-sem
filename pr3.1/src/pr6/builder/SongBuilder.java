package pr6.builder;

public class SongBuilder implements Builder{
    private String title;
    private String text;
    private int duration;
    private String name;

    public SongBuilder(String name) {
        this.name = name;
    }

    @Override
    public void writeTitle(String title) {
        this.title = title;
    }

    @Override
    public void writeText(String text) {
        this.text = text;
    }

    @Override
    public void recordSong(int duration) {
        this.duration = duration;
    }

    public Song getResult(){
        return new Song(title, text, duration, name);
    }
}

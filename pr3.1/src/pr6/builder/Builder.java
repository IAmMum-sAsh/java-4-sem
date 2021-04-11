package pr6.builder;

public interface Builder {
    void writeTitle(String title);
    void writeText(String text);
    void recordSong(int duration);
}

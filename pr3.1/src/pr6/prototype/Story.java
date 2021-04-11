package pr6.prototype;

public class Story implements Prototype{
    private String title;
    private String text;
    private int size;
    private String author;

    public Story(String title, String text, int size, String author) {
        this.title = title;
        this.text = text;
        this.size = size;
        this.author = author;
    }

    Story(Story target){
        if (target != null) {
            this.title = target.getTitle();
            this.text = target.getText();
            this.size = target.getSize();
            this.author = target.getAuthor();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getSize() {
        return size;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public Prototype clone() {
        return new Story(this);
    }

    @Override
    public void view() {
        System.out.println(author + " - " + this.title + "\n----------\n" + this.text + "\n(" + this.size + " стр.)");
    }
}

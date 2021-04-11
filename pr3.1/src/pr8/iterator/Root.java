package pr8.iterator;

public class Root implements WordPart {
    private String part;

    public Root(String part) {
        this.part = part;
    }

    @Override
    public String getWordPart() {
        return part;
    }
}

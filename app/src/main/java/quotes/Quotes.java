package quotes;

public class Quotes {
    private String author;
    private String text;

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

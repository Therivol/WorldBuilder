package worldbuilder;

public class StringItem extends Item {

    private String text;

    public StringItem(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }
}

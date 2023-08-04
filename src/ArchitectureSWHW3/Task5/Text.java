package ArchitectureSWHW3.Task5;

public class Text implements IText{
    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }
}

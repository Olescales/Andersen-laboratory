package lab.andersen.katokoleg.patterns.observer;

public class Message {

    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

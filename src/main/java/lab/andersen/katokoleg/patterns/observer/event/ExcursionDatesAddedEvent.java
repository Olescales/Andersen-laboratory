package lab.andersen.katokoleg.patterns.observer.event;

public class ExcursionDatesAddedEvent implements Event {

    private String message;

    public ExcursionDatesAddedEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

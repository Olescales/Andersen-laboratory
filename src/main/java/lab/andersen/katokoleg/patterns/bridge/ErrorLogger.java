package lab.andersen.katokoleg.patterns.bridge;

public class ErrorLogger extends Logger {

    public ErrorLogger(LogOutputter logOutputter) {
        super(logOutputter);
    }

    @Override
    public void log(String message) {
        logOutputter.log(message);
    }
}

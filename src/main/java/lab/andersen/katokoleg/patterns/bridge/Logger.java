package lab.andersen.katokoleg.patterns.bridge;

public abstract class Logger {
    protected final LogOutputter logOutputter;

    public Logger(LogOutputter logOutputter) {
        this.logOutputter = logOutputter;
    }

    public abstract void log (String message);
}

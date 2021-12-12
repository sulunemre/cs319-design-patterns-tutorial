import java.util.Date;

public class TimestampLogger extends LoggerDecorator {
    public TimestampLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = addTimestamp(message);
        super.log(message);
    }

    private String addTimestamp(String message) {
        String timestamp = new Date().toString();
        return timestamp + "----" + message;
    }
}

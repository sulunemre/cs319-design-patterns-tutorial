public class Main {
    public static void main(String[] args) {
        Logger rawLogger = FileLogger.getInstance();

        Logger decoratedLogger = new EncryptionLogger(new TimestampLogger(rawLogger));
        decoratedLogger.log("Hello World!");
    }
}

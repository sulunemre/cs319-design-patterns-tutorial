public class Main {
    public static void main(String[] args) {
        Logger rawLogger = new ConsoleLogger();

        Logger decoratedLogger = new EncryptionLogger(new TimestampLogger(rawLogger));
        decoratedLogger.log("Hello World!");
    }
}

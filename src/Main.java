public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger("log.txt");
        logger.log("Hello world!");

        Logger logger2 = new ConsoleLogger();
        logger2.log("Hello world!");
    }
}

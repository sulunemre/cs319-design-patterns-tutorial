import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileLogger implements Logger {
    private static String filePath = "log.txt";
    private static FileLogger instance;

    private FileLogger() {
    }

    public static FileLogger getInstance() {
        if (instance == null) {
            instance = new FileLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(new File(filePath), true))) {
            out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Logger {
    String target;
    String filePath;

    public Logger(String target, String filePath) {
        this.target = target;
        this.filePath = filePath;
    }

    public void log(String message) {
        if (target.equals("console")) {
            System.out.println(message);
        } else if (target.equals("file")) {
            try (PrintWriter out = new PrintWriter(new FileOutputStream(new File(filePath), true))) {
                out.println(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

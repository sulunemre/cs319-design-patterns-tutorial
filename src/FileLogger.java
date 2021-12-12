import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileLogger implements Logger {
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
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

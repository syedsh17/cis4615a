// EXP00-J: Do not ignore values returned by methods
import java.io.File;

public class R02_XP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            System.err.println("Failed to delete " + someFile.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        new R02_XP00_J().deleteFile();
    }
}

// EXP00-J: Do not ignore values returned by methods
import java.io.File;

public class R02_XP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        someFile.delete();
    }

    public static void main(String[] args) {
        new R02_XP00_J().deleteFile();
        System.out.println("deleteFile() finished.");
    }
}

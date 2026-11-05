// NUM03-J: Use integer types that can fully represent the possible range of unsigned data
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }

    public static void main(String[] args) throws IOException {
        byte[] data = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));
        System.out.println("Unsigned value read: " + getInteger(is));
    }
}

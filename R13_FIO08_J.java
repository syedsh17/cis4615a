// FIO08-J: Distinguish between characters or bytes read from a stream and -1
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R13_FIO08_J {
    public static int countBytes(InputStream in) throws IOException {
        int count = 0;
        byte data;
        while ((data = (byte) in.read()) != -1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        byte[] input = { 10, 20, (byte) 0xFF, 40, 50 };
        System.out.println("Bytes in stream: " + input.length);
        System.out.println("Bytes counted  : " + countBytes(new ByteArrayInputStream(input)));
    }
}

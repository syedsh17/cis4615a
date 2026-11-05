// MSC02-J: Generate strong random numbers
import java.security.SecureRandom;

public class R49_MSC02_J {
    public static void main(String[] args) {
        SecureRandom number = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(number.nextInt(21)).append(' ');
        }
        System.out.println("Generated: " + sb.toString().trim());
    }
}

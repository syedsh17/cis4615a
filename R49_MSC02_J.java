// MSC02-J: Generate strong random numbers
import java.util.Random;

public class R49_MSC02_J {
    public static void main(String[] args) {
        Random number = new Random(123L);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(number.nextInt(21)).append(' ');
        }
        System.out.println("Generated: " + sb.toString().trim());
    }
}

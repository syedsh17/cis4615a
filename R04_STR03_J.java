// STR03-J: Do not encode noncharacter data as a string
import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger original = new BigInteger("530500452766");
        BigInteger x = original;
        String s = x.toString();
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);

        System.out.println("Original : " + original);
        System.out.println("Recovered: " + x);
        System.out.println("Equal?   : " + original.equals(x));
    }
}

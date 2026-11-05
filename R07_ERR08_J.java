// ERR08-J: Do not catch NullPointerException or any of its ancestors
public class R07_ERR08_J {
    static boolean isCapitalized(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.isEmpty()) {
            return false;
        }
        String first = s.substring(0, 1);
        String rest = s.substring(1);
        return first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase());
    }

    public static boolean isName(String s) {
        if (s == null) {
            return false;
        }
        String[] names = s.split(" ");
        if (names.length != 2) {
            return false;
        }
        return isCapitalized(names[0]) && isCapitalized(names[1]);
    }

    public static void main(String[] args) {
        System.out.println("isName(\"Syed Haque\") = " + isName("Syed Haque"));
        System.out.println("isName(null)         = " + isName(null));
    }
}

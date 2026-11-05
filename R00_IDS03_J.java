// IDS03-J: Do not log unsanitized user input
import java.util.logging.Logger;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void logLogin(String username, boolean loginSuccessful) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }

    public static void main(String[] args) {
        String username = (args.length > 0) ? args[0]
                : "guest\nSEVERE: User login succeeded for: administrator";
        logLogin(username, false);
    }
}

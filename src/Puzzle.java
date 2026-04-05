import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Puzzle {

    private static final String SECRET_HASH =
        "b4c5ae2ae961fe88d12821bdf945b15482ef021703e1f900ccbe1a27f22df07f";

    public static boolean unlock(String keyword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(keyword.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString().equals(SECRET_HASH);
        } catch (NoSuchAlgorithmException e) {
            return false;
        }
    }
}

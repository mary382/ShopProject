package web.auth;


import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by yslabko on 08/13/2017.
 */
public class Encoder {

    public static String encode(String pwd) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(pwd.getBytes());
            Base64.Encoder base64Encoder = Base64.getEncoder();
            return base64Encoder.encodeToString(digest);

        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

}

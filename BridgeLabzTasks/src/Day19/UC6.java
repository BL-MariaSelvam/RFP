package Day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6 {
    public static boolean validateEmail(String email) {
        String pattern = "^[a-z0-9\\+]+([\\.\\-a-z0-9]+)?@[a-z0-9]+\\.[a-z]{2,}([\\.a-z]{2,})?$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}

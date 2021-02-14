package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //Pattern used for both first name and last name
    private static final String NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";

    public boolean validateName(String Name) {
        Pattern pattern =Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
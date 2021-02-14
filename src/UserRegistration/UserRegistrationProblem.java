package UserRegistration;


import java.util.regex.Pattern;

public class UserRegistrationProblem {
    private static final String NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";

    public boolean validateName(String Name) {
        Pattern pattern =Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }
}
package pl.sdacademy.designpatterns.singleton.enumm;

import java.util.HashMap;
import java.util.Map;

public enum  UsersRepository {
    INSTANCE;

    private Map<String, String> usernamesToEmails = new HashMap<>();

    public void addUser(final String username, final String email) {
        usernamesToEmails.put(username, email);
    }

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    }
}

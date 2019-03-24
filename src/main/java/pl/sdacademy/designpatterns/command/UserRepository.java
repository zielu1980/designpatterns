package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {

    private List<UserData> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(final UserData userData) {
        // TODO : add validation
        users.add(userData);
    }

    public void removeUser(final UserData userData) {
        users.remove(userData);
    }

    public List<UserData> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return users.stream().map(user -> user.getName() + " ").collect(Collectors.joining());
    }
}

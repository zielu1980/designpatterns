package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommand implements CommandBase {

    private UserData data;
    private UserRepository userRepository;

    public UserRegistrationCommand(final UserRepository userRepository, final UserData userData) {
        data = userData;
        this.userRepository = userRepository;
    }

    public UserRegistrationCommand(final UserData data) {
        this.data = data;
    }

    @Override
    public void execute() {
        userRepository.addUser(data);
    }

    @Override
    public void undo() {
        userRepository.removeUser(data);
    }
}

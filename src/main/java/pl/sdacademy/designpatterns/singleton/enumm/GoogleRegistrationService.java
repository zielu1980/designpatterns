package pl.sdacademy.designpatterns.singleton.enumm;

public class GoogleRegistrationService implements RegistrationService {
    @Override
    public void register(final String username, final String email) {
        UsersRepository.INSTANCE.addUser(username, email);
    }
}

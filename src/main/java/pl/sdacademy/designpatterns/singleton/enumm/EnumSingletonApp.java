package pl.sdacademy.designpatterns.singleton.enumm;

public class EnumSingletonApp {

    public static void main(String[] args) {
        final RegistrationService registrationServiceA = new GoogleRegistrationService();
        final RegistrationService registrationServiceB = new FBRegistrationService();
        final UsersRepository usersRepository = UsersRepository.INSTANCE;

        registrationServiceA.register("Michal", "michal@gmail.com");
        registrationServiceB.register("Adam", "adam@gmail.com");

        usersRepository.getUsernamesToEmails().forEach((k, v) -> System.out.println(k + " " + v));
    }
}

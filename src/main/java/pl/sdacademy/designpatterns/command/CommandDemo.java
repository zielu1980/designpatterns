package pl.sdacademy.designpatterns.command;

public class CommandDemo {

    public static void main(final String[] args) {
        final UserRepository userRepository = new UserRepository();

        final UserData userA = new UserData("Ala", "Kot", "ala@makota.pl", "Kot_123");
        final UserData userB = new UserData("Andrzej", "Kviat", "andrzej@gmail.com", "Kwiat_123");

        final UserRegistrationCommand userRegistrationCommandA = new UserRegistrationCommand(userRepository, userA);
        final UserRegistrationCommand userRegistrationCommandB = new UserRegistrationCommand(userRepository, userB);

        userRegistrationCommandA.execute();
        userRegistrationCommandB.execute();
        System.out.println(userRepository);

        userRegistrationCommandA.undo();
        System.out.println(userRepository);

        userRegistrationCommandB.undo();
        System.out.println(userRepository);

        userRegistrationCommandA.execute();
        System.out.println(userRepository);
    }
}

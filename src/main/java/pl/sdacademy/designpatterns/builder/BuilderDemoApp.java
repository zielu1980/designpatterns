package pl.sdacademy.designpatterns.builder;

import java.util.Arrays;

public class BuilderDemoApp {
    public static void main(String[] args) {
        final Player playerA = new Player.Builder()
                .withHealth(100)
                .withMana(50)
                .withNick("Zerg")
                .build();

        final Player playerB = new Player.Builder()
                .withFriends(Arrays.asList("Michal", "Adam"))
                .withHealth(50)
                .withNick("Ania")
                .build();

        // Add to String method
        System.out.println(playerA);
        System.out.println(playerB);

        final Person person = Person.personBuilder()
                .age(13)
                .name("Michal")
                .surname("Bocian")
                .create();
        System.out.println(person);
    }
}

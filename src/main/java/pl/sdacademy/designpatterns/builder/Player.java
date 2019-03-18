package pl.sdacademy.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int health;
    int mana;
    String nick;
    long level;
    List<String> friends;

    public Player(final int health, final int mana, final String nick, final long level, final List<String> friends) {
        this.health = health;
        this.mana = mana;
        this.nick = nick;
        this.level = level;
        this.friends = friends;
    }

    public static class Builder {
        int health;
        int mana;
        String nick;
        long level;
        List<String> friends = new ArrayList<>();

        public Builder withHealth(final int health) {
            this.health = health;
            return this;
        }

        public Builder withMana(final int mana) {
            this.mana = mana;
            return this;
        }

        public Builder withNick(final String nick) {
            this.nick = nick;
            return this;
        }

        public Builder withLevel(final long level) {
            this.level = level;
            return this;
        }

        public Builder withFriends(final List<String> friends) {
            this.friends.addAll(friends);
            return this;
        }

        public Player build() {
            return new Player(health, mana, nick, level, friends);
        }
    }
}

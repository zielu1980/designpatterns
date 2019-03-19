package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;

import java.util.Arrays;
import java.util.Collections;

public class AdapterDemo {

    public static void main(final String[] args) {
        final SystemAUser systemAUser = new SystemAUser("Michal", "Bocian", 22L, Arrays.asList("USER", "SUPPORT"));
        final SystemBUser systemBUser = new SystemBUser("Adam Adamski", "AdamA", "23", Collections.singleton("ADMIN"));

        System.out.println(new SystemAUserAdapter(systemAUser).getFullname());
        System.out.println(new SystemBUserAdapter(systemBUser).getRoles());
    }
}

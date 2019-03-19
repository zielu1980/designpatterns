package pl.sdacademy.designpatterns.proxy.security;

import java.util.Collections;
import java.util.List;

public class PersonManagmentSecurityProxy implements PersonManager {

    private final PersonManager personManager;
    private Person managingPerson;

    public PersonManagmentSecurityProxy(final Person managingPerson) {
        this.managingPerson = managingPerson;
        personManager = new PersonManagmentService();
    }

    @Override
    public void addPerson(final Person person) {
        if (hasWriteAccess()) {
            personManager.addPerson(person);
        }
    }

    @Override
    public void deletePerson(final String email) {
        if (hasWriteAccess()) {
            personManager.deletePerson(email);
        }
    }

    @Override
    public List<Person> getAllPeople() {
        if (hasReadAccess()) {
            return personManager.getAllPeople();
        }
        return Collections.emptyList();
    }

    @Override
    public boolean isPersonPresent(final String name) {
        if (hasReadAccess()) {
            return personManager.isPersonPresent(name);
        }
        return false;
    }

    @Override
    public void validateEmail(final String email) {
        if (hasWriteAccess()) {
            personManager.validateEmail(email);
        }
    }

    private boolean hasReadAccess() {
        return managingPerson.getRole().getAccessType().contains(AccessType.READ);
    }

    private boolean hasWriteAccess() {
        return managingPerson.getRole().getAccessType().contains(AccessType.WRITE);
    }
}

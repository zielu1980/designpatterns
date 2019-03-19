package pl.sdacademy.designpatterns.builder;

import lombok.Builder;

@Builder(builderMethodName = "personBuilder", buildMethodName = "create")
public class Person {
    private int age;
    private String name;
    private String surname;
}

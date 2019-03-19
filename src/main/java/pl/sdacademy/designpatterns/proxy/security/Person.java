package pl.sdacademy.designpatterns.proxy.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Role role;
    private int numOfLogins;
    private boolean verified;
}

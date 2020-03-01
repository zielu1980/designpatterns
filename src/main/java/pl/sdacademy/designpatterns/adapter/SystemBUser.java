package pl.sdacademy.designpatterns.adapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemBUser {
    private String fullName;
    private String displayName;
    private String age;
    private Set<String> roles;
}
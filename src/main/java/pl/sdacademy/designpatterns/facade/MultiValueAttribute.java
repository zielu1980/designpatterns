package pl.sdacademy.designpatterns.facade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiValueAttribute {
    private Long id;
    private String name;
    private List<String> values;


}

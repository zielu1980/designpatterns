package pl.sdacademy.designpatterns.facade;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MVAMapperImpl implements MVAMapper{

    @Override
    public MultiValueAttribute dtoToObject(MultiValueAttributeDto dto) {
        final MultiValueAttribute mva = new MultiValueAttribute();
        mva.setId(dto.getId());
        mva.setValues(Arrays.asList(dto.getCsvValues().split(",")));
        return mva;
    }

    @Override
    public MultiValueAttributeDto objectToDto(MultiValueAttribute mva) {
        final MultiValueAttributeDto dto = new MultiValueAttributeDto();
        dto.setId(mva.getId());
        dto.setName(mva.getName());
        final String values = mva.getValues().stream().collect(Collectors.joining(","));
        dto.setCsvValues(values);
        return dto;
    }
}

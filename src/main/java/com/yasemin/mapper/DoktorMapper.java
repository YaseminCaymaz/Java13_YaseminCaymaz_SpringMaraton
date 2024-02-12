package com.yasemin.mapper;

import com.yasemin.dto.request.DoktorSaveRequestDto;
import com.yasemin.entity.Doktor;
import org.mapstruct.factory.Mappers;

public interface DoktorMapper {
    DoktorMapper INSTANCE= Mappers.getMapper(DoktorMapper.class);

    Doktor fromDoktorSaveRequestDto(final DoktorSaveRequestDto dto);
    DoktorSaveRequestDto fromDoktor(final Doktor doktor);
}

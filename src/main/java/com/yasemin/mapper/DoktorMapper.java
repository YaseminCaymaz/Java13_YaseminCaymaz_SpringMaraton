package com.yasemin.mapper;

import com.yasemin.dto.request.DoktorSaveRequestDto;
import com.yasemin.dto.response.DoktorGetResponseDto;
import com.yasemin.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {
    DoktorMapper INSTANCE= Mappers.getMapper(DoktorMapper.class);

    Doktor fromDoktorSaveRequestDto(final DoktorSaveRequestDto dto);
    DoktorGetResponseDto fromDoktor(final Doktor doktor);

    List<DoktorGetResponseDto> fromDoktorList(List<Doktor> all);
}

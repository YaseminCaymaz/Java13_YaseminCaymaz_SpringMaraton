package com.yasemin.dto.request;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorSaveRequestDto {
    @NotNull
    String ad;
    @NotEmpty
    String soyad;
    @NotNull
    Long bransId;
}

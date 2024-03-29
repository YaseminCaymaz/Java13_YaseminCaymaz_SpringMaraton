package com.yasemin.dto.request;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorSaveRequestDto {
    @NotEmpty
    String ad;
    @NotEmpty
    String soyad;
    @NotNull
    Long bransId;
}

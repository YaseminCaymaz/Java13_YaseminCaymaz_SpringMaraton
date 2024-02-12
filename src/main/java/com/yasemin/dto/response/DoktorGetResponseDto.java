package com.yasemin.dto.response;

import com.yasemin.entity.Randevu;
import com.yasemin.utility.enums.DoktorDurum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorGetResponseDto {
    String ad;
    String soyad;
    DoktorDurum durum;
    List<Randevu> randevular;
}

package com.yasemin.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RandevuSaveRequestDto {
     String hastaAdi;
     String telefon;
     String adres;
     Integer yas;
     String cinsiyet;
     Long doktorId;
     Long tarih;
     Long zaman;



}

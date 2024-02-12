package com.yasemin.service;

import com.yasemin.dto.request.RandevuSaveRequestDto;
import com.yasemin.entity.Hasta;
import com.yasemin.entity.Randevu;
import com.yasemin.exception.DoktorHastaRandevuException;
import com.yasemin.exception.ErrorType;
import com.yasemin.repository.RandevuRepository;
import com.yasemin.utility.enums.Cinsiyet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RandevuService {
    private final RandevuRepository randevuRepository;
    private final HastaService hastaService;

    public Randevu save(RandevuSaveRequestDto dto) {
        Hasta hasta=hastaService.save(Hasta.builder()
                .ad(dto.getHastaAdi())
                .telefon(dto.getTelefon())
                .adres(dto.getAdres())
                .yas(dto.getYas())
                .cinsiyet(Cinsiyet.valueOf(dto.getCinsiyet()))
                .build());
        if(hasta==null)
            throw new DoktorHastaRandevuException(ErrorType.BAD_REQUEST_ERROR);
        Randevu randevu=randevuRepository.save(Randevu.builder()
                        .hastaId(hasta.getId())
                        .doktorId(dto.getDoktorId())
                        .tarih(dto.getTarih())
                        .zaman(dto.getZaman())
                .build());
        if(randevu==null)
            throw new DoktorHastaRandevuException(ErrorType.RANDEVU_OLUSTURULAMADI);
        return randevu;
    }
}

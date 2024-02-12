package com.yasemin.service;

import com.yasemin.dto.request.DoktorSaveRequestDto;
import com.yasemin.entity.Brans;
import com.yasemin.entity.Doktor;
import com.yasemin.exception.DoktorHastaRandevuException;
import com.yasemin.exception.ErrorType;
import com.yasemin.mapper.DoktorMapper;
import com.yasemin.repository.DoktorRepository;
import com.yasemin.utility.enums.DoktorDurum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DoktorService {
    private final DoktorRepository doktorRepository;
    private final BransService bransService;

    public Boolean save(DoktorSaveRequestDto dto) {
        Doktor doktor=DoktorMapper.INSTANCE.fromDoktorSaveRequestDto(dto);
        doktor.setDurum(DoktorDurum.CALISIYOR);
       if(doktorRepository.save(doktor)==null)
           throw new DoktorHastaRandevuException(ErrorType.ERROR_DOKTOR_EKLEME_HATASI);
       else
           return true;

    }
    public List<Doktor> getAll() {
        List<Doktor> doktorList=doktorRepository.findAll();
        if(doktorList.isEmpty())
            throw new DoktorHastaRandevuException(ErrorType.INTERNAL_ERROR);
        return doktorList;
    }

    /**
     * Doktorları tek bransa göre bulup getirme
     * @param bransAd
     * @return
     */
    public List<Doktor> findByBrans(String bransAd) {
        Brans brans=bransService.getByName(bransAd);
        List<Doktor> doktorList=doktorRepository.findAll().stream().filter(y->y.getBransId()==(brans.getId())).toList();
        if (doktorList.isEmpty())
            throw new DoktorHastaRandevuException(ErrorType.INTERNAL_ERROR);
        return doktorList;
    }
}

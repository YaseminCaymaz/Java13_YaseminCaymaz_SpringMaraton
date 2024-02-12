package com.yasemin.service;

import com.yasemin.entity.Brans;
import com.yasemin.exception.DoktorHastaRandevuException;
import com.yasemin.exception.ErrorType;
import com.yasemin.repository.BransRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BransService {
    private final BransRepository bransRepository;

    public void save(String brans) {
        if(bransRepository.findByAd(brans)!=null)
            throw new DoktorHastaRandevuException(ErrorType.BRANS_ZATEN_KAYITLI);
       bransRepository.save(Brans.builder().ad(brans).build());
    }

    public List<Brans> findAll() {
        List<Brans> bransList=bransRepository.findAll();
        if (bransList.isEmpty())
            throw new DoktorHastaRandevuException(ErrorType.ISTENILEN_VERI_BULUNMAKTADIR);
        return bransList;
    }

    public Brans getById(Long id) {
        Optional<Brans> brans=bransRepository.findById(id);
        if(brans.isEmpty())
            throw new DoktorHastaRandevuException(ErrorType.ID_NOT_FOUND);
        return brans.get();
    }
    public Brans getByName(String bransName){
        Brans brans=bransRepository.findByAd(bransName);
        if(brans==null)
            throw new DoktorHastaRandevuException(ErrorType.ISTENILEN_VERI_BULUNMAKTADIR);
        return brans;
    }
}

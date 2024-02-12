package com.yasemin.service;

import com.yasemin.entity.Hasta;
import com.yasemin.exception.DoktorHastaRandevuException;
import com.yasemin.exception.ErrorType;
import com.yasemin.repository.HastaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HastaService {
    private final HastaRepository hastaRepository;

    public Hasta save(Hasta build) {
        return hastaRepository.save(build);
    }

    public List<Hasta> getAll() {
        List<Hasta> hastaList = hastaRepository.findAll();
        if(hastaList.isEmpty()){
            throw new DoktorHastaRandevuException(ErrorType.ISTENILEN_VERI_BULUNAMAMAKTADIR);
        }
        return hastaList;
    }

    public Hasta getById(Long id) {
        return hastaRepository.findById(id).orElseThrow(() -> new DoktorHastaRandevuException(ErrorType.ISTENILEN_VERI_BULUNAMAMAKTADIR));
    }
}

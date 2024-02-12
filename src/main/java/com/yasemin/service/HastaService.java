package com.yasemin.service;

import com.yasemin.entity.Hasta;
import com.yasemin.repository.HastaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HastaService {
    private final HastaRepository hastaRepository;

    public Hasta save(Hasta build) {
        return hastaRepository.save(build);
    }
}

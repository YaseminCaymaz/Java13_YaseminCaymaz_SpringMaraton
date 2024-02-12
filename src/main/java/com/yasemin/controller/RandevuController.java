package com.yasemin.controller;

import com.yasemin.dto.request.RandevuSaveRequestDto;
import com.yasemin.entity.Randevu;
import com.yasemin.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(RANDEVU)
public class RandevuController {
    private final RandevuService randevuService;
    @PostMapping(ADD)
    public Randevu save(@RequestBody @Valid RandevuSaveRequestDto dto){
        return randevuService.save(dto);
    }
    @GetMapping(FIND_BY_DOKTORID)
    public ResponseEntity<List<Randevu>> findByDoktorId(Long doktorId){
        return ResponseEntity.ok(randevuService.findByDoktorId(doktorId));
    }
    @GetMapping(GET_ALL)
    public ResponseEntity<List<Randevu>> getAll(){return ResponseEntity.ok(randevuService.getAll());}
    @GetMapping(FIND_BY_HASTAID)
    public ResponseEntity<List<Randevu>> findByHastaId(Long hastaId){
        return ResponseEntity.ok(randevuService.findByHastaId(hastaId));
    }
    @GetMapping(FIND_BY_TARIH)
    public ResponseEntity<List<Randevu>> findByTarih(Long tarih){
        return ResponseEntity.ok(randevuService.findByTarih(tarih));
    }
}

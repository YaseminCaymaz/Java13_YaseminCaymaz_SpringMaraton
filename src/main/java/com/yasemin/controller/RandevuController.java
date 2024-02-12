package com.yasemin.controller;

import com.yasemin.dto.request.RandevuSaveRequestDto;
import com.yasemin.entity.Randevu;
import com.yasemin.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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
    public List<Randevu> findByDoktorId(Long doktorId){
        return randevuService.findByDoktorId(doktorId);
    }
}

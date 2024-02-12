package com.yasemin.controller;

import com.yasemin.dto.request.RandevuSaveRequestDto;
import com.yasemin.entity.Randevu;
import com.yasemin.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

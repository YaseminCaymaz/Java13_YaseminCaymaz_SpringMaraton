package com.yasemin.controller;

import com.yasemin.dto.request.DoktorSaveRequestDto;
import com.yasemin.dto.response.DoktorGetResponseDto;
import com.yasemin.entity.Doktor;
import com.yasemin.entity.Randevu;
import com.yasemin.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(DOKTOR)
public class DoktorController {
    private final DoktorService doktorService;
    private final RandevuController randevuController;
   @PostMapping(ADD)
   public ResponseEntity<Void> save(@RequestBody @Valid DoktorSaveRequestDto dto){
       doktorService.save(dto);
       return ResponseEntity.ok().build();
   }
    @GetMapping(GET_ALL)
    public ResponseEntity<List<DoktorGetResponseDto>>  getAll() {
        return  ResponseEntity.ok(doktorService.getAll());
    }
    @GetMapping(GET_BY_BRANS)
    public ResponseEntity<List<Doktor>>  findByBrans(String brans){
       return  ResponseEntity.ok(doktorService.findByBrans(brans));
    }



}

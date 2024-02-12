package com.yasemin.controller;

import com.yasemin.dto.request.DoktorSaveRequestDto;
import com.yasemin.entity.Doktor;
import com.yasemin.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(DOKTOR)
public class DoktorController {
    private final DoktorService doktorService;
    @GetMapping(ADD)
    public ResponseEntity<Boolean>  save(@RequestBody @Valid DoktorSaveRequestDto dto) {
        return ResponseEntity.ok(doktorService.save(dto));
    }
    @GetMapping(GET_ALL)
    public ResponseEntity<List<Doktor>>  getAll(){
        return ResponseEntity.ok(doktorService.getAll());
    }
    @GetMapping(GET_BY_BRANS)
    public ResponseEntity<List<Doktor>>  findByBrans(String brans){
       return  ResponseEntity.ok(doktorService.findByBrans(brans));
    }


}

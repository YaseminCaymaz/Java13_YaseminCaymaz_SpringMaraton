package com.yasemin.controller;

import com.yasemin.entity.Hasta;
import com.yasemin.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(HASTA)
public class HastaController {
    private final HastaService hastaService;
    @GetMapping(GET_ALL)
    public ResponseEntity<List<Hasta>> getAll(){
        return ResponseEntity.ok(hastaService.getAll());
    }
    @GetMapping(GET_BY_ID)
    public ResponseEntity<Hasta> getById(Long id){
        return ResponseEntity.ok(hastaService.getById(id));
    }
}

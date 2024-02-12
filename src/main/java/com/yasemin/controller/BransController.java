package com.yasemin.controller;

import com.yasemin.entity.Brans;
import com.yasemin.service.BransService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BRANS)
public class BransController {
    private final BransService bransService;

    @PostMapping(ADD)
    public ResponseEntity<Void> save(String brans) {
        bransService.save(brans);
        return ResponseEntity.ok().build();
    }
    @GetMapping(GET_ALL)
    public ResponseEntity<List<Brans>> getAll() {
        return ResponseEntity.ok(bransService.findAll());
    }
    @GetMapping(GET_BY_ID)
    public ResponseEntity<Brans> getById(Long id){
        return ResponseEntity.ok(bransService.getById(id));
    }

}

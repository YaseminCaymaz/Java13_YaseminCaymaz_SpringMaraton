package com.yasemin.controller;

import com.yasemin.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.yasemin.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(HASTA)
public class HastaController {
    private final HastaService hastaService;
}

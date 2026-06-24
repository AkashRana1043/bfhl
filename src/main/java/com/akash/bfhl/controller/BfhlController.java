package com.akash.bfhl.controller;

import com.akash.bfhl.dto.RequestDto;
import com.akash.bfhl.dto.ResponseDto;
import com.akash.bfhl.service.BfhlService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BfhlController {

    private final BfhlService service;

    public BfhlController(BfhlService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public Map<String,String> health() {
        return Map.of("status","UP");
    }

    @PostMapping("/bfhl")
    public ResponseDto bfhl(@RequestBody RequestDto request) {
        return service.process(request);
    }
}
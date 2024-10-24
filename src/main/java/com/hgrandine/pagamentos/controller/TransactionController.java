package com.hgrandine.pagamentos.controller;

import com.hgrandine.pagamentos.entity.Payload;
import com.hgrandine.pagamentos.service.PayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("*/transacoes/*")
public class TransactionController {

    @Autowired
    private PayloadService service;

    @PostMapping
    public ResponseEntity<Payload> createPayload (@RequestBody Payload payload){
        return ResponseEntity.ok(service.create(payload));
    }

    @GetMapping
    public List<Payload> searchAllPayloads(){
        return service.searchAll();
    }
}

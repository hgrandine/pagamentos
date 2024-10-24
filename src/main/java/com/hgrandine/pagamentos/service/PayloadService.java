package com.hgrandine.pagamentos.service;

import com.hgrandine.pagamentos.entity.Payload;
import com.hgrandine.pagamentos.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayloadService {

    @Autowired
    private PayloadRepository repository;

    public Payload create(Payload payload) {
        return repository.save(payload);
    }

    public List<Payload> searchAll() {
        return repository.findAll();
    }
}

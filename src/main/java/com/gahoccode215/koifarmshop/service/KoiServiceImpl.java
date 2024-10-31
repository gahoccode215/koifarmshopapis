package com.gahoccode215.koifarmshop.service;

import com.gahoccode215.koifarmshop.pojo.Koi;
import com.gahoccode215.koifarmshop.repository.KoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KoiServiceImpl {
    @Autowired
    private KoiRepository koiRepository;

    public Koi addKoi(Koi koi){
        return koiRepository.save(koi);
    }
    public List<Koi> getAllKois(){
        return koiRepository.findAll();
    }
}

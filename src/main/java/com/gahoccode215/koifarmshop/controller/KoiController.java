package com.gahoccode215.koifarmshop.controller;

import com.gahoccode215.koifarmshop.pojo.Koi;
import com.gahoccode215.koifarmshop.service.KoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/admin/kois")
public class KoiController {
    @Autowired
    private KoiServiceImpl koiService;

    @PostMapping
    public Koi addKoi(@RequestBody Koi koi) {
        return koiService.addKoi(koi);
    }
    @GetMapping
    public List<Koi> getAllKois() {
        return koiService.getAllKois();
    }
    @GetMapping("/{id}")
    public Optional<Koi> getKoiById(@PathVariable Long id){
        return koiService.getKoiById(id);
    }
}

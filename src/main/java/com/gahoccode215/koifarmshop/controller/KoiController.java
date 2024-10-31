package com.gahoccode215.koifarmshop.controller;

import com.gahoccode215.koifarmshop.pojo.Koi;
import com.gahoccode215.koifarmshop.service.KoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/kois")
public class KoiController {
    @Autowired
    private KoiServiceImpl koiService;

    @PostMapping
    public Koi addKoi(@RequestBody Koi koi) {
        return koiService.addKoi(koi);
    }
}

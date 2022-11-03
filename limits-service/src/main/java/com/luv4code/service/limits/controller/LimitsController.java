package com.luv4code.service.limits.controller;

import com.luv4code.service.limits.bean.Limits;
import com.luv4code.service.limits.configuration.LimitsConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final LimitsConfiguration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}

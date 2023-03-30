package com.springcrash.springrestapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationInfo {

    @Value("${appName: defaultApp}")
    private String appName;

    @Value("${appVersion: 1.0.0}")
    private String appVersion;

    @GetMapping("")
    public String appDetails() {
        return appName + " - V" + appVersion;
    }
}

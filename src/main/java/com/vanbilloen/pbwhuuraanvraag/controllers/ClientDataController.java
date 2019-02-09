package com.vanbilloen.pbwhuuraanvraag.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientDataController {

    @RequestMapping("/")
    public String index() {
        return "Pwb data controller";
    }
}

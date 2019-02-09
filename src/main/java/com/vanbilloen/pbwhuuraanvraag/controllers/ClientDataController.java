package com.vanbilloen.pbwhuuraanvraag.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientDataController {

    @RequestMapping(method = RequestMethod.POST, value = "")
    public String postUserInformation() {
        return "New controller";
    }
}

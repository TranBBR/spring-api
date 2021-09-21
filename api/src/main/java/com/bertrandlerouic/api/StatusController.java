package com.bertrandlerouic.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
@RequestMapping("/status")  
public class StatusController {

    @GetMapping()
    public String GetStatus(){
        return "OK";
    }
}
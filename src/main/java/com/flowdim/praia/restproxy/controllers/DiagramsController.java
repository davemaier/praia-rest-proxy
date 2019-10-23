package com.flowdim.praia.restproxy.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DiagramsController{

    @GetMapping("/diagrams")
    public String diagrams(@RequestParam(name = "userId") String userId){
        return "Baum";

    }
}
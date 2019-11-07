package com.flowdim.praia.restproxy.controllers;



import com.flowdim.praia.restproxy.model.Tree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DiagramsController{

    @GetMapping("/diagrams")
    public Tree diagrams(@RequestParam(name = "userId") String userId){
        return new Tree("Oak");

    }
}
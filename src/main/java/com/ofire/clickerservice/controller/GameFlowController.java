package com.ofire.clickerservice.controller;


import com.ofire.clickerservice.repository.GameFlowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class GameFlowController {

    private final GameFlowRepository gameFlowRepository;

    @GetMapping("/gameflow/{id}")
    public void getById(@PathVariable UUID id){
        gameFlowRepository.findAll();
        System.out.println("here");
    }

}

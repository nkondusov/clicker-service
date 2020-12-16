package com.ofire.clickerservice.controller;


import com.ofire.clickerservice.repository.GameFlowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/api/v1/")
public class GameFlowController {

    private final GameFlowRepository gameFlowRepository;

    @GetMapping
    public void getById(){
        gameFlowRepository.findAll();
        System.out.println("here");
    }

}

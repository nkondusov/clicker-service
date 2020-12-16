package com.ofire.clickerservice.controller;


import com.ofire.clickerservice.dto.GameFlowDTO;
import com.ofire.clickerservice.service.GameflowService;
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

    private final GameflowService gameflowService;

    @GetMapping("/gameflow/{id}")
    public GameFlowDTO getById(@PathVariable UUID id){
        return gameflowService.getGameflow(id);
    }

}

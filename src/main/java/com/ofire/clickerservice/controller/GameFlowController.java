package com.ofire.clickerservice.controller;


import com.ofire.clickerservice.dto.GameFlowDTO;
import com.ofire.clickerservice.request.CreateGameflowRequest;
import com.ofire.clickerservice.service.GameflowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/gameflow")
    public GameFlowDTO create(@RequestBody CreateGameflowRequest request){
        return gameflowService.createGameflow(request);
    }
}

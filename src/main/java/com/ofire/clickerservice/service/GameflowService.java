package com.ofire.clickerservice.service;

import com.ofire.clickerservice.converter.GameflowConverter;
import com.ofire.clickerservice.dto.GameFlowDTO;
import com.ofire.clickerservice.repository.GameFlowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GameflowService {

    private final GameFlowRepository gameFlowRepository;
    private final GameflowConverter gameflowConverter;

    public GameFlowDTO getGameflow(UUID id){
        return gameFlowRepository.findById(id).map(gameflowConverter::convert).orElseThrow();
    }

}

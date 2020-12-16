package com.ofire.clickerservice.service;

import com.ofire.clickerservice.converter.GameflowConverter;
import com.ofire.clickerservice.dto.GameFlowDTO;
import com.ofire.clickerservice.entity.GameFlow;
import com.ofire.clickerservice.exception.ValidationException;
import com.ofire.clickerservice.repository.GameFlowRepository;
import com.ofire.clickerservice.request.CreateGameflowRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GameflowService {

    private static final BigDecimal INITIAL_COMPLEXITY = BigDecimal.ONE;
    private static final BigDecimal INITIAL_SKILL = BigDecimal.ONE;
    private static final BigDecimal INITIAL_PROGRESS_REMAINING = BigDecimal.valueOf(100);

    private final GameFlowRepository gameFlowRepository;
    private final GameflowConverter gameflowConverter;

    public GameFlowDTO getGameflow(UUID id) {
        return gameFlowRepository.findById(id).map(gameflowConverter::convert).orElseThrow();
    }

    public GameFlowDTO createGameflow(CreateGameflowRequest createGameflowRequest) {
        if (gameFlowRepository.findById(createGameflowRequest.getUserId()).isPresent()) {
            throw new ValidationException(String.format("Gameflow with id %s already exists",
                    createGameflowRequest.getUserId()));
        }

        return gameflowConverter.convert(gameFlowRepository.save(createNew(createGameflowRequest.getUserId())));

    }

    private GameFlow createNew(UUID id) {
        return GameFlow.builder()
                .userId(id)
                .currentClickEntityId(UUID.randomUUID())
                .entityComplexity(INITIAL_COMPLEXITY)
                .userSkill(INITIAL_SKILL)
                .entityProgressRemaining(INITIAL_PROGRESS_REMAINING)
                .lastClickTimestamp(Instant.now())
                .build();
    }
}

package com.ofire.clickerservice.converter;

import com.ofire.clickerservice.dto.GameFlowDTO;
import com.ofire.clickerservice.entity.GameFlow;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GameflowConverter implements Converter<GameFlow, GameFlowDTO> {
    @Override
    public GameFlowDTO convert(GameFlow source) {
        return GameFlowDTO.builder()
                .userId(source.getUserId())
                .currentClickEntityId(source.getCurrentClickEntityId())
                .entityComplexity(source.getEntityComplexity())
                .entityProgressRemaining(source.getEntityProgressRemaining())
                .lastClickTimestamp(source.getLastClickTimestamp())
                .userSkill(source.getUserSkill())
                .build();
    }
}

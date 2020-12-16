package com.ofire.clickerservice.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;


@Value
@Builder
public class GameFlowDTO {
    private UUID userId;
    private Instant lastClickTimestamp;
    private UUID currentClickEntityId;
    private BigDecimal entityProgressRemaining;
    private BigDecimal entityComplexity;
    private BigDecimal userSkill;
}

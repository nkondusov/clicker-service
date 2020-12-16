package com.ofire.clickerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Table
@Data
@AllArgsConstructor
@Builder
public class GameFlow {

    @PrimaryKey("user_id")
    private UUID userId;
    @Column("last_click_timestamp")
    private Instant lastClickTimestamp;
    @Column("current_click_entity_id")
    private UUID currentClickEntityId;
    @Column("entity_progress_remaining")
    private BigDecimal entityProgressRemaining;
    @Column("entity_complexity")
    private BigDecimal entityComplexity;
    @Column("user_skill")
    private BigDecimal userSkill;
}

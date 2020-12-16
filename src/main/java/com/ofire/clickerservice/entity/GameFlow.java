package com.ofire.clickerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Data
@AllArgsConstructor
public class GameFlow {

    @PrimaryKey("user_id")
    private UUID userId;
    /*
    @Column
    private Instant lastClickTimestamp;
    @Column
    private UUID currentClickEntityId;
    @Column
    private BigDecimal entityProgressRemaining;
    @Column
    private BigDecimal entityComplexity;
    @Column
    private BigDecimal userSkill;

     */

}

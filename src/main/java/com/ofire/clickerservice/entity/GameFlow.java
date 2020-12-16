package com.ofire.clickerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Data
@AllArgsConstructor
public class GameFlow {

    @PrimaryKeyColumn(
            name = "user_id",
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING)
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

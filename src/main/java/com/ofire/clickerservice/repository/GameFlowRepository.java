package com.ofire.clickerservice.repository;

import com.ofire.clickerservice.entity.GameFlow;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameFlowRepository extends CassandraRepository<GameFlow, UUID> {
}

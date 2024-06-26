package com.gycoding.fallofthegods.model.database.repository;

import com.gycoding.fallofthegods.model.entities.worlds.EntityWorld;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository for the World entity.
 * @see EntityWorld
 * @see MongoRepository
 * @see Repository
 * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
 */
@Repository
public interface WorldRepository extends MongoRepository<EntityWorld, String> {
    /**
     * Finds a World by its identifier.
     * @param identifier
     * @return EntityWorld
     * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
     * @see Optional
     * @see EntityWorld
     */
    Optional<EntityWorld> findByIdentifier(String identifier);
}

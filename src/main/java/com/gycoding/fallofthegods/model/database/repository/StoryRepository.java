package com.gycoding.fallofthegods.model.database.repository;

import com.gycoding.fallofthegods.model.entities.characters.EntityStory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository for the Story entity.
 * @see EntityStory
 * @see MongoRepository
 * @see Repository
 * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
 */
@Repository
public interface StoryRepository extends MongoRepository<EntityStory, String> {
    /**
     * Finds a Story by its identifier.
     * @param identifier
     * @return EntityStory
     * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
     * @see Optional
     * @see EntityStory
     */
    Optional<EntityStory> findByIdentifier(String identifier);
}

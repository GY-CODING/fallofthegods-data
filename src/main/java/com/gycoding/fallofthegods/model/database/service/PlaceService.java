package com.gycoding.fallofthegods.model.database.service;

import com.gycoding.fallofthegods.model.database.repository.PlaceRepository;
import com.gycoding.fallofthegods.model.entities.worlds.EntityPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service for the Place entity.
 * @see EntityPlace
 * @see PlaceRepository
 * @see Service
 * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
 */
@Service
public class PlaceService {
    @Autowired
    private final PlaceRepository placeRepository = null;

    /**
     * Finds a Place by its identifier.
     * @param id
     * @return EntityPlace
     * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
     * @see EntityPlace
     * @see PlaceRepository
     */
    public EntityPlace getPlace(String id) {
        return placeRepository.findByIdentifier(id).orElse(null);
    }

    /**
     * Lists all places.
     * @return List of EntityPlace
     * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
     * @see List
     * @see EntityPlace
     * @see PlaceRepository
     */
    public List<EntityPlace> listPlaces() {
        return placeRepository.findAll();
    }

    /**
     * Lists all places with pagination.
     * @return List of EntityPlace
     * @author Ivan Vicente Morales (<a href="https://toxyc.dev/">ToxYc</a>)
     * @see Pageable
     * @see Page
     * @see Map
     * @see EntityPlace
     * @see PlaceRepository
     */
    public Page<Map<String, Object>> pagePlaces(Pageable pageable) {
        return placeRepository.findAll(pageable)
                .map(EntityPlace::toMap);
    }
}

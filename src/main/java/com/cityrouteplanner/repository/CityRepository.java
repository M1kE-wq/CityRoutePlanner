package com.cityrouteplanner.repository;

import com.cityrouteplanner.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for City entity.
 * Provides CRUD operations and custom query methods for cities.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
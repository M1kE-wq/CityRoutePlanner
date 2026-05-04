package com.cityrouteplanner.repository;

import com.cityrouteplanner.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Road entity.
 * Provides CRUD operations and custom query methods for roads.
 */
@Repository
public interface RoadRepository extends JpaRepository<Road, Long> {
}
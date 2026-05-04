package com.cityrouteplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * City entity representing a city in the route planning system.
 * Each city has a unique identifier, name, and coordinates for visualization.
 */
@Entity
@Table(name = "cities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the city
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * X-coordinate for visualization on a 2D plane
     */
    @Column(nullable = false)
    private Double x;

    /**
     * Y-coordinate for visualization on a 2D plane
     */
    @Column(nullable = false)
    private Double y;
}
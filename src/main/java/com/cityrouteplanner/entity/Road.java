package com.cityrouteplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Road entity representing a connection between two cities.
 * Each road has a distance and connects two cities (directed edge).
 */
@Entity
@Table(name = "roads")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Road {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The city from which the road originates
     */
    @ManyToOne
    @JoinColumn(name = "from_city_id", nullable = false)
    private City fromCity;

    /**
     * The city to which the road leads
     */
    @ManyToOne
    @JoinColumn(name = "to_city_id", nullable = false)
    private City toCity;

    /**
     * The distance of the road (typically in kilometers)
     */
    @Column(nullable = false)
    private Double distance;
}
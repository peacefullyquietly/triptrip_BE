package com.example.TripTrip.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String coordinate;
    private String locationImg;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long userId;

}

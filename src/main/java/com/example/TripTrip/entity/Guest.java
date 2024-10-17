package com.example.TripTrip.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "join_Number")
    private String joinNumber;

    private String status;

    @ManyToOne
    @JoinColumn(name = "log_id", nullable = false)
    private Long logId;

}

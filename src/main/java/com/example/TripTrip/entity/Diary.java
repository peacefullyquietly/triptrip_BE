package com.example.TripTrip.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "diary")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "log_id", nullable = false)
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Long teamId;

}

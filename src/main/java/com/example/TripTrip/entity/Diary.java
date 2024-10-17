package com.example.TripTrip.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;


// 내가 지금부터 알아봐야 할 것들
// 1. Entity 어노테이션의 종류에 대하여
// 2. lombok에 대하여 (@ToString, @Lob)
// 3. text에 대한 어노테이션들

// @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")

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

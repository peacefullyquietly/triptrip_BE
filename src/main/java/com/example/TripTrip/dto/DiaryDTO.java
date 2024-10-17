package com.example.TripTrip.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryDTO {
    private Long id;
    private Timestamp date;
    private String title;
    private String content;
    private Long logId;
    private Long userId;
    private Long teamId;

}

package com.example.TripTrip.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryImgDTO {
    private Long id;
    private String imgUrl;
    private Long diaryId;

}

package com.codingshuttle.projects.airBnbApp.dto;

import java.math.BigDecimal;

public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal basePrice;
    private String[] photos;
    private String[] amenities;
    private Integer totalCount;
    private Integer capacity;
}

package com.codingshuttle.projects.airBnbApp.service;

import com.codingshuttle.projects.airBnbApp.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
}

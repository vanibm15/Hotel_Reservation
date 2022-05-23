package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelResevation {
    private List<Hotel> hotels = new ArrayList<>();

    public HotelResevation() {
    }

    public HotelResevation(List<Hotel> hotels) {
        this.hotels = hotels;

    }

    void  add(Hotel hotel) {
        this.hotels.add(hotel);
    }
        List<Hotel> hotelList() {
            return this.hotels;
        }
    }


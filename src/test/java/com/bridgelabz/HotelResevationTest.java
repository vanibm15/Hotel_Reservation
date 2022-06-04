package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HotelResevationTest extends HotelResevation {

    @Test
    void whenHotelAdded_ToSystem_ToGetAdded() {
        Hotel hotel1=new Hotel("Lakewood",110,90,80,80,3);
        Hotel hotel2=new Hotel("Bridgewood",160,60,110,50,4);
        Hotel hotel3=new Hotel("Ridgewood",220,150,100,40,5);
Hotel[] hotelList ={hotel1,hotel2,hotel3};//arraylist
        List<Hotel> hotels= Arrays.asList(hotelList);
        HotelResevation hotelResevation=new HotelResevationTest();
        hotelResevation.add(hotel1);
        hotelResevation.add(hotel2);
        hotelResevation.add(hotel3);
        List<Hotel>result = hotelResevation.hotelList();

    }
    @Test
    public void whenGivenDateRangeShouldReturnCheapestHotel()
    {
        Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
        HotelResevation hotelReservation = new HotelResevation();
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        Map<Integer, Hotel> result = hotelReservation.searchFor("10Sep2020", "11Sep2020");
        result.forEach((k, v) -> System.out.println(v.getName() + " " + k));
        assertNotNull(result);
    }
}
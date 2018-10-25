package com.codeclan.example.bookingsystem.Controllers;

import com.codeclan.example.bookingsystem.Repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingsystem.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getAllBookingsForDate(@PathVariable String date){
        return bookingRepository.getAllBookingsForDate(date);
    }


    }

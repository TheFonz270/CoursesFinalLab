package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

        @Autowired
        CustomerRepository customerRepository;

        @Autowired
        CourseRepository courseRepository;

        @Autowired
        BookingRepository bookingRepository;

        public DataLoader() {

        }

        public void run(ApplicationArguments args) {
            Course speech101 = new Course("How to speak and what to say", "Edinburgh", 5);
            courseRepository.save(speech101);

            Customer customer1 = new Customer("John", "John Town USA", 23);
            customerRepository.save(customer1);

            Booking booking1 = new Booking("01.02.22", speech101, customer1);
            bookingRepository.save(booking1);

        }
}

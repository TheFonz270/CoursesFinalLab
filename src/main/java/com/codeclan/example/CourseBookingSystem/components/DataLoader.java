package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{


        @Autowired
        CourseRepository courseRepository;

        public DataLoader() {

        }

        public void run(ApplicationArguments args) {
            Course speech101 = new Course("How to speak and what to say", "Edinburgh", 5);
            courseRepository.save(speech101);

        }
}

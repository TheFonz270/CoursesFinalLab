package com.codeclan.example.CourseBookingSystem.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {
    @Column(name = "name")
    private String name;
    @Column(name = "town")
    private String town;
    @Column(name = "rating")
    private int star_rating;

    @JsonIgnoreProperties({"course"})
    @JsonBackReference
    @OneToMany(mappedBy="course")
    private List<Booking> bookings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    public Course(String name, String town, int star_rating) {
        this.name = name;
        this.town = town;
        this.star_rating = star_rating;
        this.bookings = new ArrayList<>();
    }

    public Course(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(int star_rating) {
        this.star_rating = star_rating;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}

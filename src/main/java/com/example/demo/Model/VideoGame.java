package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VideoGame")
public class VideoGame {

    //MEM VARS
    @Id
    private Long id;
    private String name;
    private String studio;
    private String rating;
    private String review;

    //CONSTRUCTOR
    public VideoGame(Long id, String name, String studio, String rating, String review) {
        this.id = id;
        this.name = name;
        this.studio = studio;
        this.rating = rating;
        this.review = review;
    }

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

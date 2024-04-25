package com.example.bookreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Harnidh Kaur
 *
 * Class Name: Book Review Data
 * Description: This is the model to represent book review data
 */
@Entity
public class BookReviewData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String review_text;
    private Integer rating;

    // Empty constructor
    public BookReviewData() {}

    // Constructor with parameters
    public BookReviewData(Long id, String title, String author, String publisher, String review_text, Integer rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.review_text = review_text;
        this.rating = rating;
    }

    // Setters and getters

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

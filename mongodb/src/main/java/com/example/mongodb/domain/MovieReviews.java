package com.example.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class MovieReviews {

    private  String reviewerName;
    private  Integer reviewRatingOutOfTen;
    private  String review;
    private  Boolean isGoodMovie;

    public MovieReviews(String reviewerName, Integer reviewRatingOutOfTen, String review, Boolean isGoodMovie) {
        this.reviewerName = reviewerName;
        this.reviewRatingOutOfTen = reviewRatingOutOfTen;
        this.review = review;
        this.isGoodMovie = isGoodMovie;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Integer getReviewRatingOutOfTen() {
        return reviewRatingOutOfTen;
    }

    public void setReviewRatingOutOfTen(Integer reviewRatingOutOfTen) {
        this.reviewRatingOutOfTen = reviewRatingOutOfTen;
    }

    public Boolean getGoodMovie() {
        return isGoodMovie;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setGoodMovie(Boolean goodMovie) {
        isGoodMovie = goodMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieReviews that = (MovieReviews) o;
        return reviewerName.equals(that.reviewerName) &&
                reviewRatingOutOfTen.equals(that.reviewRatingOutOfTen) &&
                review.equals(that.review) &&
                isGoodMovie.equals(that.isGoodMovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewerName, reviewRatingOutOfTen, review, isGoodMovie);
    }

    @Override
    public String toString() {
        return "MovieReviews{" +
                "reviewerName='" + reviewerName + '\'' +
                ", reviewRatingOutOfTen=" + reviewRatingOutOfTen +
                ", review='" + review + '\'' +
                ", isGoodMovie=" + isGoodMovie +
                '}';
    }
}

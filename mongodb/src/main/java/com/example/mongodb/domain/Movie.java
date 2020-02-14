package com.example.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection="Movies")
public class Movie {
    @Id
    private  String   id;
    private String name;
    private String[] category;
    private Date dateOfRelease;
    private  Double revenue;
    private String language;
    private  MovieCast castDetails;
    private List<MovieReviews> movieReviews;

    public Movie(String name, String[] category, Date dateOfRelease, Double revenue, String language, MovieCast castDetails, List<MovieReviews> movieReviews) {
        this.name = name;
        this.category = category;
        this.dateOfRelease = dateOfRelease;
        this.revenue = revenue;
        this.language = language;
        this.castDetails = castDetails;
        this.movieReviews = movieReviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public MovieCast getCastDetails() {
        return castDetails;
    }

    public void setCastDetails(MovieCast castDetails) {
        this.castDetails = castDetails;
    }

    public List<MovieReviews> getMovieReviews() {
        return movieReviews;
    }

    public void setMovieReviews(List<MovieReviews> movieReviews) {
        this.movieReviews = movieReviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) &&
                Objects.equals(name, movie.name) &&
                Arrays.equals(category, movie.category) &&
                Objects.equals(dateOfRelease, movie.dateOfRelease) &&
                Objects.equals(revenue, movie.revenue) &&
                Objects.equals(language, movie.language) &&
                Objects.equals(castDetails, movie.castDetails) &&
                Objects.equals(movieReviews, movie.movieReviews);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, dateOfRelease, revenue, language, castDetails, movieReviews);
        result = 31 * result + Arrays.hashCode(category);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + Arrays.toString(category) +
                ", dateOfRelease=" + dateOfRelease +
                ", revenue=" + revenue +
                ", language='" + language + '\'' +
                ", castDetails=" + castDetails +
                ", movieReviews=" + movieReviews +
                '}';
    }
}



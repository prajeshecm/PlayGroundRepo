package com.example.mongodb.domain;

import java.util.Arrays;

public class MovieCast {

    private  String[] castNamewithRole;

    public MovieCast(){};

    public MovieCast(String[] castNamewithRole) {
        this.castNamewithRole = castNamewithRole;
    }


    public void setCastNamewithRole(String[] castNamewithRole) {
        this.castNamewithRole = castNamewithRole;
    }

    @Override
    public String toString() {
        return "MovieCast{" +
                "castNamewithRole=" + Arrays.toString(castNamewithRole) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieCast movieCast = (MovieCast) o;
        return Arrays.equals(castNamewithRole, movieCast.castNamewithRole);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(castNamewithRole);
    }
}

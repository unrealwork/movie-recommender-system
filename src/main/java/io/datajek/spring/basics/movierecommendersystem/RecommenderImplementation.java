package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public final class RecommenderImplementation {
    private final Filter collaborativeFilter;

    public RecommenderImplementation(@Qualifier("CF") Filter collaborativeFilter) {
        this.collaborativeFilter = collaborativeFilter;
    }

    public String[] recommendMovies(String movie) {
        Objects.requireNonNull(movie);
        //use content based filter to find similar movies
        //return the results
        return collaborativeFilter.getRecommendations("Finding Dory");
    }
}

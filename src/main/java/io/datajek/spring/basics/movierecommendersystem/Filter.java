package io.datajek.spring.basics.movierecommendersystem;

public interface Filter {
    String[] getRecommendations(String movie);
}

package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component("CF")
public final class CollaborativeFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {};
    }
}

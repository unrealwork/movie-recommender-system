package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public final class ContentBasedFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}


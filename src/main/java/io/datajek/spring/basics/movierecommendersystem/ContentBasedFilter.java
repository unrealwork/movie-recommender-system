package io.datajek.spring.basics.movierecommendersystem;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Getter
public final class ContentBasedFilter implements Filter {
    private static int instances = 0;
    private final Movie movie;

    public ContentBasedFilter(final Movie movie) {
        instances++;
        this.movie = movie;
        log.info("ContentBasedFilter constructor called");
    }

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }
}


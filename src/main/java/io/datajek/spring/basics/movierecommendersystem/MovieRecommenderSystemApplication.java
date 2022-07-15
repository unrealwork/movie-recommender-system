package io.datajek.spring.basics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SuppressWarnings("HideUtilityClassConstructor")
@SpringBootApplication
public class MovieRecommenderSystemApplication {
    private static final Logger LOG = LoggerFactory.getLogger(MovieRecommenderSystemApplication.class);

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        //create object of RecommenderImplementation class
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        if (LOG.isInfoEnabled()) {
            LOG.info("{}", Arrays.toString(result));
        }
    }

}

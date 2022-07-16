package io.datajek.spring.basics.movierecommendersystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SuppressWarnings("HideUtilityClassConstructor")
@SpringBootApplication
@Slf4j
public class MovieRecommenderSystemApplication {


    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Retrieve and print singleton bean from application context
        ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
        log.info("\nContentBasedFilter bean with singleton scope");
        log.info("{}", filter);

        //Retrieve and print prototype bean from the singleton bean twice
        Movie movie1 = filter.getMovie();
        Movie movie2 = filter.getMovie();
        Movie movie3 = filter.getMovie();

        log.info("Movie bean with prototype scope");
        log.info("{} {} {}", movie1, movie2, movie3);

        //Print number of instances of each bean
        log.info("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
        log.info("Movie instances created: " + Movie.getInstances());
    }

}

package io.datajek.spring.basics.movierecommendersystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsArrayWithSize.emptyArray;

@SpringBootTest
class FilterTest {
    @Autowired
    @Qualifier("contentBasedFilter")
    private Filter contentBasedFilter;

    @Autowired
    @Qualifier("CF")
    private Filter collaborativeFilter;


    @Test
    void testCollaborativeFilter() {
        String[] recommendations = collaborativeFilter.getRecommendations("movie");
        assertThat(recommendations, emptyArray());
    }

    @Test
    void testContentFilter() {
        String[] recommendations = contentBasedFilter.getRecommendations("movie");
        assertThat(recommendations, is(new String[] {"Happy Feet", "Ice Age", "Shark Tale"}));
    }
}

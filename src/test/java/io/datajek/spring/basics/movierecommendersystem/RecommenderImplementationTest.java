package io.datajek.spring.basics.movierecommendersystem;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
class RecommenderImplementationTest {
    public static final String[] MOCK_RES = new String[] {"test"};
    @Mock
    private Filter filterMock;

    @InjectMocks
    private RecommenderImplementation recommender;


    @Test
    void testRecommendMovies() {
        Mockito.when(filterMock.getRecommendations(anyString())).thenReturn(MOCK_RES);
        assertThat(recommender.recommendMovies("movie"), is(MOCK_RES));
    }
}

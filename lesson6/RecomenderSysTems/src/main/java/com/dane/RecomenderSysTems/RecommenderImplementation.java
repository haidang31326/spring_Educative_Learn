package com.dane.RecomenderSysTems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private final filter filter;
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") filter filter) {
        this.filter = filter;
        System.out.println("Inside RecommenderImplementation constructor");
    }

    public String[] recommendMovies(String movie) {

        System.out.println("name of the filter use in Recommeder: " + filter);
        String[] recommendations = filter.getRecommendations(movie);

        return recommendations;
    }
}

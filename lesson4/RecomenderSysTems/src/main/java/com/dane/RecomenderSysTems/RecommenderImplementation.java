package com.dane.RecomenderSysTems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private filter filter;

    public RecommenderImplementation(filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {

        System.out.println("name of the filter use in Recommeder: " + filter);
        String[] recommendations = filter.getRecommendations(movie);

        return recommendations;
    }
}

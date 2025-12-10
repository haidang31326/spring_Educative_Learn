package com.dane.RecomenderSysTems;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie) {

        ContentBasedFilter contentB = new ContentBasedFilter();
        String[] recommendations = contentB.getRecommendations(movie);

        return recommendations;
    }
}

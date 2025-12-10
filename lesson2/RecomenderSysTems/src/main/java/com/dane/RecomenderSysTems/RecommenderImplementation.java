package com.dane.RecomenderSysTems;

public class RecommenderImplementation {
    private final Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {

        System.out.println("name of the filter use in Recommeder: " + filter);
        String[] recommendations = filter.getRecommendations(movie);

        return recommendations;
    }
}

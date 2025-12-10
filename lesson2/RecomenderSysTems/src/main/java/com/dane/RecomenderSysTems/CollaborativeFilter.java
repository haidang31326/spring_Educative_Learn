package com.dane.RecomenderSysTems;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic

        return new String[] { "The Dark Knight", "Inception", "Interstellar"};
    }
}

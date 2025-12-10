package com.dane.RecomenderSysTems;

public class ContentBasedFilter  implements  Filter{

    public String[] getRecommendations(String movie) {
        //logic

        return new String[] { "Happy Feet", "Ice Age", "Toy Story"};
    }
}

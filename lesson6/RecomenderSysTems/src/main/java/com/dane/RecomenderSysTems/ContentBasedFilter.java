package com.dane.RecomenderSysTems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class ContentBasedFilter implements filter {

    public String[] getRecommendations(String movie) {
        //logic

        return new String[] { "Happy Feet", "Ice Age", "Toy Story"};
    }
}

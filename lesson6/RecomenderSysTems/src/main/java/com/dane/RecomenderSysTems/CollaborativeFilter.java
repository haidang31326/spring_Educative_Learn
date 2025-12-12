package com.dane.RecomenderSysTems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
public class CollaborativeFilter implements filter {

    public String[] getRecommendations(String movie) {
        //logic

        return new String[] { "The Dark Knight", "Inception", "Interstellar"};
    }
}

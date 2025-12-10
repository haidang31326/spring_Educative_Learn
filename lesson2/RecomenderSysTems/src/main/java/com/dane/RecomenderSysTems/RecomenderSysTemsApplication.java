package com.dane.RecomenderSysTems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RecomenderSysTemsApplication {

	public static void main(String[] args) {
        RecommenderImplementation app = new RecommenderImplementation(new ContentBasedFilter());

        String[] result = app.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(result));
	}

}

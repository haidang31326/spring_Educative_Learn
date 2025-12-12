package com.dane.RecomenderSysTems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class RecomenderSysTemsApplication {

	public static void main(String[] args) {
        ApplicationContext applicationCT = SpringApplication.run(RecomenderSysTemsApplication.class, args);

        //RecommenderImplementation recommender = applicationCT.getBean(RecommenderImplementation.class);

       // String[] result = recommender.recommendMovies("dane TEa");

        //System.out.println(Arrays.toString(result));

        System.out.println("RecommenderImplementation2 application started");

        RecommenderImplementation2 recommender2 = applicationCT.getBean(RecommenderImplementation2.class);

        String[] result2 = recommender2.recommendMovies("DANE SAIDS");

        System.out.println(Arrays.toString(result2));
	}

}

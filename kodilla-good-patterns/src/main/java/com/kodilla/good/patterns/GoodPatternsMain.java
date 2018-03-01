package com.kodilla.good.patterns;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GoodPatternsMain {
    public static void main (String[] args){

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> theListOfMovies = movieStore.getMovies();

        theListOfMovies.entrySet().stream()
                .map(entry -> entry.getValue() + "!")
                .forEach(System.out::print);





    }

}

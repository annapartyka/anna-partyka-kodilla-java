package com.kodilla.good.patterns;

import java.util.*;

public class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Irona Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslactions = new ArrayList<>();
        flashTranslactions.add("Błyskawica");
        flashTranslactions.add("Flash");

        Map<String, List<String>> booksTitleTranslations = new HashMap<>();
        booksTitleTranslations.put("IM", ironManTranslations);
        booksTitleTranslations.put("AV", avengersTranslations);
        booksTitleTranslations.put("FL", flashTranslactions);

        return booksTitleTranslations;
    }
}

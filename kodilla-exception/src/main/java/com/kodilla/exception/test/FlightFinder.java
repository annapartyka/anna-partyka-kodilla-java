package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String,Boolean> findFlight (){
        HashMap<String,Boolean> flightsTable = new HashMap<>();
        flightsTable.put("Radom", false);
        flightsTable.put("Okęcie", true);
        flightsTable.put("Balice", true);
        flightsTable.put("Jasionka", false);
        flightsTable.put("Pyrzowice",true);

        return flightsTable;
    }

}

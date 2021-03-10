package com.company;

import java.util.HashMap;
import java.util.Map;

public class TravelPlan {

    City Cit;
    private Map<Location, Integer> Preferinta = new HashMap<>();

    public void setPrioritate(Location loc, int prioritate) {
        Preferinta.put(loc, prioritate);
    }

    public TravelPlan(City Cit){
        this.Cit =Cit;
    }
}
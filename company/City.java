package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class City extends Location implements Visitable
{
    private LocalTime openingTime, closingTime;
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }
    private List<Location> nodes = new ArrayList<>();

    public Location getNode(int index){
        return nodes.get(index);
    }
    public void addLocation(Location node) {
        nodes.add(node);
    }

}

package com.company;

import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location>
{
 private String name;
 private Map<Location, Integer> cost = new HashMap<>();
 //… constructors, getters, setters
 public void setCost(Location node, int value) {
  cost.put(node, value);
 }
 //… toString, etc.
 @Override
 public int compareTo(Location other) {
  return this.name.compareTo(other.name);
  //not safe, check if name is null before
 }



}
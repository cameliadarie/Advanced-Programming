package com.company;
import java.time.LocalTime;
public class Main {

    public static void main(String arggs[]) {
        Museum m = new Museum();
        m.setOpeningTime(LocalTime.of(9, 30)); //9:30
        m.setClosingTime(LocalTime.parse("17:00"));
        // m.setTicketPrice(20);
        Church c = new Church();
        c.setOpeningTime(LocalTime.of(7, 0));
        c.setClosingTime(LocalTime.MIDNIGHT);
        Visitable[] arr = {m, c};
        City Cit = new City();
        Location v1 = new Hotel();
        Location v2 = new Museum();
        Location v3 = new Museum();
        Location v4 = new Church();
        Location v5 = new Church();
        Location v6 = new Restaurant();
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);
        Cit.addLocation(v1);
        Cit.addLocation(v2);
        Cit.addLocation(v3);
        Cit.addLocation(v4);
        Cit.addLocation(v5);
        Cit.addLocation(v6);

System.out.println(Visitable.getVisitingDuration(LocalTime.of(4,23),LocalTime.of(4,54)));
TravelPlan pan = new TravelPlan(Cit);

pan.setPrioritate(v1,2);
    }
}



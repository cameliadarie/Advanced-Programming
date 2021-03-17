package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solutie {

    Map<Student, School> sol = new HashMap<>();

    public void rez(Problema p) {
        int index = p.studentList.size();
        for (int i = index - 1; i >= 0; i--)
            for (int j = 0; j < p.preferinteStudenti.get(p.studentList.get(i)).size(); j++)
                if (p.preferinteStudenti.get(p.studentList.get(i)).get(j).capacity != 0) {
                    sol.put(p.studentList.get(i), p.preferinteStudenti.get(p.studentList.get(i)).get(j));
                    p.preferinteStudenti.get(p.studentList.get(i)).get(j).capacity--;
                    j = p.preferinteStudenti.get(p.studentList.get(i)).size();
                }
        for (Map.Entry<Student, School> me : sol.entrySet()) {
            System.out.println(me.getKey().getName() + ", " + me.getValue().getNume());

        }
    }
}

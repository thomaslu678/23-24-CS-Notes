package org.canyonsdistrict.hhs.chapter13;

import static org.canyonsdistrict.hhs.chapter13.PartialSolution.ACCEPT;
import static org.canyonsdistrict.hhs.chapter13.PartialSolution.CONTINUE;


public class EightQueensApp {

    public static void solve(PartialSolution solution) {
        var test = solution.examine();
        if (test == ACCEPT) {
            System.out.println(solution);
        }
        else if (test == CONTINUE) {
            for (var partial : solution.extend()) {
                solve(partial);
            }
        }
    }

}

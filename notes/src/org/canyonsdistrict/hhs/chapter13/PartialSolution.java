package org.canyonsdistrict.hhs.chapter13;

import java.util.Arrays;

public class PartialSolution {

    private Queen[] queens;

    public static final int NUM_QUEENS = 8;
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;

    public PartialSolution(int size) {
        this.queens = new Queen[size];
    }

    public int examine() {

        for(int i = 0; i < queens.length; i++){
            for (int j = 0; j < queens.length; j++){
                if(queens[i].attack(queens[j])){
                    return ABANDON;
                }
            }
        }

        if(queens.length == NUM_QUEENS){
            return ACCEPT;
        }
        else {
            return CONTINUE;
        }

    }

    public PartialSolution[] extend(){
        PartialSolution[] result = new PartialSolution[NUM_QUEENS];
        for(int i = 0; i < result.length; i++){
            int size = queens.length;

            result[i] = new PartialSolution(size + 1);

            // copes the current partial solution
            for(int j = 0; j < size; j++){
                result[i].queens[j] = queens[j];
            }

            result[i].queens[size] = new Queen(size, 1);

        }

        return result;

    }

    public String toString() {
        return Arrays.toString(queens);
    }
}

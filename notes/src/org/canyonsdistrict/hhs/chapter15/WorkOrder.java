package org.canyonsdistrict.hhs.chapter15;

public class WorkOrder implements Comparable<WorkOrder> {

    private int priority;
    private String name;

    public WorkOrder(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public String toString() {
        return String.format("%d: %s", priority, name);
    }

    @Override
    public int compareTo(WorkOrder o) {
        return 0;
    }
}

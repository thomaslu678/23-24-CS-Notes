package org.canyonsdistrict.hhs.chapter15;

import java.util.PriorityQueue;

public class PriorityQueueApp {

    public static void main(String[] args) {

        PriorityQueue<WorkOrder> queue = new PriorityQueue();
        queue.add(new WorkOrder(3, "Do laundry"));
        queue.add(new WorkOrder(5, "Pull weeds"));
        queue.add(new WorkOrder(1, "Make food"));

        var first = queue.remove();
        System.out.println(first);

    }

}

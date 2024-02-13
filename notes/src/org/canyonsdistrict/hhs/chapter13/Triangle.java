package org.canyonsdistrict.hhs.chapter13;

public class Triangle {

    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        //terminating condition
        if (width <= 0) {
            return 0;
        }
        else if (width == 1) {
            return 1;
        }

        var smallerTriangle = new Triangle(width - 1);
        var smallerArea = smallerTriangle.getArea();
        return smallerArea + width;

    }

}

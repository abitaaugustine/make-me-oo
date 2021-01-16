package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        double xDistance = getDifference(this.x, to.x);
        double yDistance = getDifference(this.y, to.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point to) {
        double xDistance = getDifference(this.x, to.x);
        double yDistance = getDifference(this.y, to.y);
        return Math.atan2(yDistance, xDistance);
    }

    private double getDifference(double value1, double value2) {
        return value1 - value2;
    }
}

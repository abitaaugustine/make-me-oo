package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distanceCalculated = origin.distance(origin);

        Assertions.assertEquals(0, distanceCalculated);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distanceCalculated1 = origin.distance(point1);
        double distanceCalculated2 = origin.distance(point2);

        Assertions.assertEquals(1, distanceCalculated1);
        Assertions.assertEquals(1, distanceCalculated2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distanceCalculated = point2.distance(point1);

        Assertions.assertEquals(2, distanceCalculated);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double directionCalculated1 = point1.direction(origin);
        double directionCalculated2 = point2.direction(origin);

        Assertions.assertEquals(0, directionCalculated1);
        Assertions.assertEquals(0, directionCalculated2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double directionCalculated1 = point1.direction(origin);
        double directionCalculated2 = point2.direction(origin);

        Assertions.assertEquals(Math.PI, directionCalculated1);
        Assertions.assertEquals(Math.PI, directionCalculated2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double directionCalculated1 = point1.direction(origin);
        double directionCalculated2 = point2.direction(origin);

        Assertions.assertEquals(Math.PI / 2, directionCalculated1);
        Assertions.assertEquals(Math.PI / 2, directionCalculated2);
    }
}

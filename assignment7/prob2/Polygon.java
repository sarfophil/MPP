package com.mpp.lesson7.prob2;

/**
 * @author SARFO PHILIP
 */
public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter(){
        double[] sides = getSides();
        double totalSides = 0.0;
        for (double side : sides)
            totalSides += side;
        return totalSides;
    }
}

package com.pj.ns;

public class VerticalParabola extends Figure {

    public VerticalParabola(double x0, double y0, double a) {
        super(x0, y0, a);
    }

    public boolean isPointAbove(double x, double y) {
        return y > a * Math.pow(x - x0, 2) + y0;
    }
}

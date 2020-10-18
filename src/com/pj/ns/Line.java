package com.pj.ns;

public class Line extends Figure{

    public Line(double x0, double y0, double a) {
        super(x0, y0, a);
    }

    public boolean isPointAbove(double x, double y) {
        return y > a * (x - x0) + y0;
    }
}

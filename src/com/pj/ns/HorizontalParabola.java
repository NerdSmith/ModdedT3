package com.pj.ns;

public class HorizontalParabola extends Figure{

    public HorizontalParabola(double x0, double y0, double a) {
        super(x0, y0, a);
    }

    public boolean isPointAbove(double x, double y) {
        return x > a * Math.pow(y - y0, 2) + x0;
    }
}

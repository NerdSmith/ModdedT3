package com.pj.ns;

public abstract class Figure {
    double x0;
    double y0;
    double a;

    public Figure(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public abstract boolean isPointAbove(double x, double y);
}

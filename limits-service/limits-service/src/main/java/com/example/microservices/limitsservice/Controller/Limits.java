package com.example.microservices.limitsservice.Controller;


public class Limits {
    private int minimum;
    private int maximum;

    public int getMinimum() {
        return this.minimum;
    }

    Limits()
    {

    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

}

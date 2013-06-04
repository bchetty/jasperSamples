package com.bchetty.reporting.jasper.data;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class ThermoBean {
    private String title;
    private double value;
    private double rangeMin;
    private double rangeMax;
    private double firstSubRangeMin;
    private double firstSubRangeMax;
    private double secondSubRangeMin;
    private double secondSubRangeMax;
    private double thirdSubRangeMin;
    private double thirdSubRangeMax;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setRangeMin(double rangeMin) {
        this.rangeMin = rangeMin;
    }

    public double getRangeMin() {
        return rangeMin;
    }

    public void setRangeMax(double rangeMax) {
        this.rangeMax = rangeMax;
    }

    public double getRangeMax() {
        return rangeMax;
    }

    public void setFirstSubRangeMin(double firstSubRangeMin) {
        this.firstSubRangeMin = firstSubRangeMin;
    }

    public double getFirstSubRangeMin() {
        return firstSubRangeMin;
    }

    public void setFirstSubRangeMax(double firstSubRangeMax) {
        this.firstSubRangeMax = firstSubRangeMax;
    }

    public double getFirstSubRangeMax() {
        return firstSubRangeMax;
    }

    public void setSecondSubRangeMin(double secondSubRangeMin) {
        this.secondSubRangeMin = secondSubRangeMin;
    }

    public double getSecondSubRangeMin() {
        return secondSubRangeMin;
    }

    public void setSecondSubRangeMax(double secondSubRangeMax) {
        this.secondSubRangeMax = secondSubRangeMax;
    }

    public double getSecondSubRangeMax() {
        return secondSubRangeMax;
    }

    public void setThirdSubRangeMin(double thirdSubRangeMin) {
        this.thirdSubRangeMin = thirdSubRangeMin;
    }

    public double getThirdSubRangeMin() {
        return thirdSubRangeMin;
    }

    public void setThirdSubRangeMax(double thirdSubRangeMax) {
        this.thirdSubRangeMax = thirdSubRangeMax;
    }

    public double getThirdSubRangeMax() {
        return thirdSubRangeMax;
    }
}

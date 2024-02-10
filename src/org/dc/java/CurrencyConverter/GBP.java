package org.dc.java.CurrencyConverter;

// GBP Currency class
public class GBP implements Currency {
    // Creates a constant for the exchange rate
    private static final double GBP_TO_CAD_RATE = 1.73;

    // Returns the rate from GBP to CAD
    @Override
    public double convertToCAD(double amount) {
        return amount * GBP_TO_CAD_RATE;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount / GBP_TO_CAD_RATE;
    }
}

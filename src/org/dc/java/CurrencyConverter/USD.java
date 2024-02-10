package org.dc.java.CurrencyConverter;

// USD Currency class
public class USD implements Currency {
    // Creates a constant for the exchange rate
    private static final double USD_TO_CAD_RATE = 1.345;

    // Returns the rate from USD to CAD
    @Override
    public double convertToCAD(double amount) {
        return amount * USD_TO_CAD_RATE;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount / USD_TO_CAD_RATE;
    }
}
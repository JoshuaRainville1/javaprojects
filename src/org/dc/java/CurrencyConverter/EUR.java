package org.dc.java.CurrencyConverter;

// EUR Currency class
public class EUR implements Currency {
    // Creates a constant for the exchange rate
    private static final double EUR_TO_CAD_RATE = 1.47;

    // Returns the rate from EUR to CAD
    @Override
    public double convertToCAD(double amount) {
        return amount * EUR_TO_CAD_RATE;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount / EUR_TO_CAD_RATE;
    }
}

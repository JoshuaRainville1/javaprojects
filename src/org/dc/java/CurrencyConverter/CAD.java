package org.dc.java.CurrencyConverter;

// CAD Currency class
public class CAD implements Currency {
    // Creates constants for the exchange rate's
    // Rates are the most recent they can be
    private static final double CAD_TO_USD_RATE = 0.743;
    private static final double CAD_TO_GBP_RATE = 0.588;
    private static final double CAD_TO_EUR_RATE = 0.689;

    @Override
    public double convertToCAD(double amount) {
        return amount;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount;
    }

    // Does the conversions from the different currencies
    public double convertToUSD(double amount) {
        return amount * CAD_TO_USD_RATE;
    }

    public double convertToGBP(double amount) {
        return amount * CAD_TO_GBP_RATE;
    }

    public double convertToEUR(double amount) {
        return amount * CAD_TO_EUR_RATE;
    }
}


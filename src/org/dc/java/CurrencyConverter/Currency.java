package org.dc.java.CurrencyConverter;

// Interface for Currency classes
public interface Currency {
    // Creates two methods that convert to and from CAD
    double convertToCAD(double amount);
    double convertFromCAD(double amount);
}

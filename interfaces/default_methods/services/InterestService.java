package interfaces.default_methods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInteresetRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        } else {
            return amount * Math.pow(1.0 + getInteresetRate() / 100.0, months);
        }
    }
}

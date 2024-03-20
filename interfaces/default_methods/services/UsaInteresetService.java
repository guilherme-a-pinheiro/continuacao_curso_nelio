package interfaces.default_methods.services;

import java.security.InvalidParameterException;

public class UsaInteresetService implements InterestService {
    private double interestRate;

    public UsaInteresetService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInteresetRate() {
        return interestRate;
    }
}

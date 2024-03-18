package interfaces.services;

import interfaces.entities.CarRental;
import interfaces.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;

    private BrazilTaxServices taxServices;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxServices taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public BrazilTaxServices getTaxServices() {
        return taxServices;
    }

    public void setTaxServices(BrazilTaxServices taxServices) {
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxServices.tax(basicPayment);


        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}

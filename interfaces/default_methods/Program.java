package interfaces.default_methods;

import interfaces.default_methods.services.BrazilInteresetService;
import interfaces.default_methods.services.InterestService;
import interfaces.default_methods.services.UsaInteresetService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService s = new UsaInteresetService(1.0);
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", s.payment(amount, months)));

        sc.close();
    }
}

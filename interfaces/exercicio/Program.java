package interfaces.exercicio;


import interfaces.exercicio.entities.Contract;
import interfaces.exercicio.entities.Installment;
import interfaces.exercicio.services.ContractService;
import interfaces.exercicio.services.OnlinePaymentService;
import interfaces.exercicio.services.PaypallService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService cs = new ContractService(new PaypallService());

        cs.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment i : contract.getInstallment()){
            System.out.println(i);
        }


        sc.close();
    }
}

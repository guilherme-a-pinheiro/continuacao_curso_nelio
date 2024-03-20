package interfaces.comparable;

import interfaces.comparable.entities.Employees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String strPath = "C:\\Users\\Guilherme\\Desktop\\estudos\\java\\continuacao_curso_nelio\\interfaces\\comparable\\employees.csv";

        List<Employees> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while(line != null){
                String[] lineSplit = line.split(",");
                String name = lineSplit[0];
                double salary = Double.parseDouble(lineSplit[1]);
                list.add(new Employees(name, salary));
                line = br.readLine();
            }
            Collections.sort(list);

            for (Employees emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

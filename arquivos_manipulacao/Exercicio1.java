package arquivos_manipulacao;

import arquivos_manipulacao.entities.Product;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String scannerPath = sc.nextLine();

        String strPath = scannerPath + "\\summary.csv";
        File path = new File(strPath);

        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while (line != null){
                String[] lineSplit = line.split(",");
                String name = lineSplit[0];
                double price = Double.parseDouble(lineSplit[1]);
                int quantity = parseInt(lineSplit[2]);

                Product product = new Product(name, price, quantity);
                list.add(String.valueOf(product));

                line = br.readLine();
            }

            String outPath = path.getParent() + "\\out";
            boolean successFolder = new File(outPath).mkdir();

            String outFilePath = outPath + "\\summary.csv";
            boolean successFile = new File(outFilePath).createNewFile();

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))){
                for (String item : list){
                    bw.write(item);
                    bw.newLine();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("CREATED!");
    }
}

package interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String strPath = "C:\\Users\\Guilherme\\Desktop\\estudos\\java\\continuacao_curso_nelio\\interfaces\\comparable\\in.txt";

        List<String> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String name = br.readLine();

            while(name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);

            for (String n : list){
                System.out.println(n);
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

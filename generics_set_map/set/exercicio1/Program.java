package generics_set_map.setExemplos.exercicio1;

import generics_set_map.set.exercicio1.entities.Users;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String strPath = "C:\\Users\\Guilherme\\Desktop\\estudos\\java\\continuacao_curso_nelio\\generics_set_map\\set\\exercicio1\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            Set<Users> set = new LinkedHashSet<>();

            while (line != null){
                String[] lineSplitado = line.split(" ");
                Users user = new Users(lineSplitado[0], lineSplitado[1]);

                set.add(user);


                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

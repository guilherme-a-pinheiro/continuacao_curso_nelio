package generics_set_map.map.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        String strPath = "C:\\Users\\Guilherme\\Desktop\\estudos\\java\\continuacao_curso_nelio\\generics_set_map\\map\\exercicio\\in.csv";

        Map<String, Integer> candidates = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
                String line = br.readLine();
                while(line != null){
                    String[] lineSplitada = line.split(",");
                    String name = lineSplitada[0];
                    Integer votes = Integer.valueOf(lineSplitada[1]);

                    if (candidates.containsKey(name)) {
                        candidates.put(name, candidates.get(name) + votes);
                    }
                    else {
                        candidates.put(name, votes);
                    }

                    line = br.readLine();
                }

            System.out.println("Using this path/file: " + strPath);
            System.out.println("Alex Blue: " + candidates.get("Alex Blue"));
            System.out.println("Maria Green: " + candidates.get("Maria Green"));
            System.out.println("Bob Brown: " + candidates.get("Bob Brown"));
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}

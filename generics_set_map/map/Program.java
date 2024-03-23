package generics_set_map.map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "930030718");

        cookies.remove("email");
        cookies.put("phone", "918273123");

        System.out.println(cookies.containsKey("phone"));

        System.out.println("All cookies:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}

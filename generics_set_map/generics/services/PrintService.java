package generics_set_map.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Integer> list = new ArrayList<>();

    public void addValue(int value){
        list.add(value);
    }

    public int first(){
        return list.getFirst();
    }

    public void print(){
        System.out.println(list);
    }
}

package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class SymbolTable {
    // 2 symbol tables
    private ArrayList<ArrayList<Pair>> elements = new ArrayList<>();
    private int size = 13;
    private int index = 0;

    public SymbolTable() {
        for(int i=0; i<size; i++) {
            this.elements.add(new ArrayList<>());
        }
    }

    public void add(String value) {
        if(this.search(value) == -1){
            int hashCode = value.hashCode() % size;
            elements.get(hashCode).add(new Pair(value, index));
            index++;
        }
    }


    public int search(String value) {
        int hashCode = value.hashCode() % size;
        ArrayList<Pair> listElements = elements.get(hashCode);
        if(listElements.isEmpty()){
            return -1;
        }

        for (Pair pair : listElements) {
            if(Objects.equals(pair.getElement(), value)){
                return pair.getCode();
            }
        }
        return -1;
    }




    @Override
    public String toString() {
        StringBuilder table = new StringBuilder("| element | code | \n");
        for (ArrayList<Pair> array:
                elements) {
            if(!array.isEmpty()){
                for (Pair pair: array) {
                    table.append(pair.toString());
                }
            }
        }
        return table.toString();
    }
}

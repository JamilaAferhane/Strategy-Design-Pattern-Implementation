package com.objet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ValueSort implements Strategy_1 {
    @Override
    public void sort(List<Objet> objets) {

        Collections.sort(objets, new Comparator<Objet>() {
            @Override
            public int compare(Objet product1, Objet product2) {
                return product1.getValue() - product2.getValue();
            }
        });
        System.out.println("\n Sorting objects by value sort strategy");
        for (Objet p: objets) {
            System.out.println("{name : "+p.getName()+"\t price : "+p.getPrice()+"\t value :"+p.getValue()+" }");
        }
    }
}

package com.objet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSort implements Strategy_1 {
    @Override
    public void sort(List<Objet> objets) {
        Collections.sort(objets, new Comparator<Objet>() {
            @Override
            public int compare(Objet product1, Objet product2) {
                return product1.getName().compareTo(product2.getName());
            }
        });
        System.out.println("\n Sorting products by name sort strategy");
        for (Objet p: objets) {
            System.out.println("{name : "+p.getName()+"\t price : "+p.getPrice()+"\t value :"+p.getValue()+" }");
        }
}
}



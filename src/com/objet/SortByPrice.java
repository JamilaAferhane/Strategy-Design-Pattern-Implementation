package com.objet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements Strategy_1 {

    @Override
    public void sort(List<Objet> objets) {

        Collections.sort(objets, new Comparator<Objet>() {
            @Override
            public int compare(Objet objet_1, Objet objet_2) {
                return objet_1.getPrice() - objet_2.getPrice();
            }
        });
        System.out.println("\n Sorting products by price sort strategy");
        for (Objet p: objets) {
            System.out.println("{name : "+p.getName()+"\t price : "+p.getPrice()+"\t value :"+p.getValue()+" }");
        }
    }
}
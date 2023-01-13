package com.objet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Objet objet_2 = new Objet("car", 100000,988);
        Objet objet_3 = new Objet("bicycle", 5000,6001);
        Objet objet_5 = new Objet("pants", 200,1002);
        List<Objet> objets = new ArrayList<>();
        objets.add(objet_2);
        objets.add(objet_3);
        objets.add(objet_5);

        Context ctx = new Context (new NameSort());
        ctx.arrange(objets);

        ctx = new Context (new SortByPrice());
        ctx.arrange(objets);

        ctx = new Context (new ValueSort());
        ctx.arrange(objets);
    }
}

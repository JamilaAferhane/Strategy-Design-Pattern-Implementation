package com.objet;


import java.util.List;

public class Context {

    private final Strategy_1 strategy;
    public Context (Strategy_1 strategy){
        this.strategy = strategy;
    }
    public void arrange(List<Objet> input){
            strategy.sort(input);
        }
}



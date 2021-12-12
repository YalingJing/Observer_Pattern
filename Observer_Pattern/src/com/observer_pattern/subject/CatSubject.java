package com.observer_pattern.subject;

import com.observer_pattern.observer.Observer;

import java.util.ArrayList;

public class CatSubject implements Subject{
    private ArrayList observers;
    public CatSubject(){
        observers = new ArrayList();
    }

    @Override
    public void aim(Observer observer) {
        this.observers.add(observer);
    }

    public void cry(){
        System.out.println("猫开始叫了！");
        for(Object observer:this.observers){
            ((Observer) observer).response();
        }
    }
}

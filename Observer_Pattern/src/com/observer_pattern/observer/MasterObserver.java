package com.observer_pattern.observer;

import com.observer_pattern.subject.Subject;

public class MasterObserver implements Observer{

    public MasterObserver(Subject sub){
        sub.aim(this);
    }

    @Override
    public void response() {
        System.out.println("主人被惊醒了");
    }
}

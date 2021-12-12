package com.observer_pattern.observer;

import com.observer_pattern.subject.Subject;

public class MouseObserver implements Observer{
    String name;
    public MouseObserver(Subject sub, String name){
        this.name = name;
        sub.aim(this);
    }

    @Override
    public void response() {
        System.out.println(name + "老鼠开始逃跑");
    }
}

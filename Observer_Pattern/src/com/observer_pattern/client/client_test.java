package com.observer_pattern.client;

import com.observer_pattern.observer.MasterObserver;
import com.observer_pattern.observer.MouseObserver;
import com.observer_pattern.subject.CatSubject;

public class client_test {
    public static void main(String[] args){
        CatSubject c = new CatSubject();
        MouseObserver mouse1 = new MouseObserver(c,"mouse001");
        MouseObserver mouse2 = new MouseObserver(c,"mouse002");
        MasterObserver masterObserver = new MasterObserver(c);
        c.cry();
    }
}

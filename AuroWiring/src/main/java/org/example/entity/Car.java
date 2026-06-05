package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private Engine engine;



    @Autowired
    @Qualifier("Heroengine")
    public void setEngine(Engine engine) {
        System.out.println("Set Engine Using Setter injection...");
        this.engine = engine;
    }

    public void Selfstart(){
        System.out.println(engine);
        if(engine!=null){
            engine.start();
        }else{
            System.out.println("Issue in Start Engine");
        }


    }
}
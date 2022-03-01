package com.example.mylistview.decorator;

public class BMW5 extends BMWDecorator {

    public BMW5(ICar bmw, String modelName) {
        super(bmw, modelName, 4_000);
    }
}
package com.example.mylistview.decorator;

public class BMW3 extends BMWDecorator {

    public BMW3(ICar bmw, String modelName) {
        super(bmw, modelName, 2_000);
    }
}
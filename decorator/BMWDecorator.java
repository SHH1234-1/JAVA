package com.example.mylistview.decorator;

public class BMWDecorator implements ICar {

    protected ICar bmw;
    protected String modelName;
    protected int modelPrice;

    public BMWDecorator(ICar bmw, String modelName, int modelPrice) {
        this.bmw = bmw;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return bmw.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + " 의 가격은 " + getPrice() + " 만원 입니다.");
    }
}
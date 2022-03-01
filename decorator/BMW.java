package com.example.mylistview.decorator;

public class BMW implements ICar {

    int price;

    public BMW( int price) { //생성자
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void showPrice() {
        System.out.println("BMW 기본 가격은 " + this.price + " 입니다.");
    }
}
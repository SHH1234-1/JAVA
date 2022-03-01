package com.example.mylistview.decorator;

public class MainTest {

    public static void main(String[] args) {

        ICar bmw = new BMW(1_000);
        bmw.showPrice();

        // 3
        ICar bmw3 = new BMW3(bmw, "BMW3");
        bmw3.showPrice();

        // 4
        ICar bmw4 = new BMW4(bmw, "BMW4");
        bmw4.showPrice();

        // 5
        ICar bmw5 = new BMW5(bmw, "BMW5");
        bmw5.showPrice();
    }
}
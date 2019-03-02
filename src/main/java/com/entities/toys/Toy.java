package com.entities.toys;

import com.entities.toys.type.Size;

public  abstract class Toy {
     Size size;
    int price;

    public Toy(Size size, int price) {
        this.size = size;
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    void showUniqueFild(){

 }

}

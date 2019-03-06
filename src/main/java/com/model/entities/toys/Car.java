package com.model.entities.toys;

import com.model.entities.toys.type.Size;
import com.model.entities.toys.type.TypeControl;

public class Car extends Toy {

    private TypeControl typeControl;

    public Car(Size size, int price, TypeControl typeControl) {
        super(size, price);
        this.typeControl = typeControl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("typeControl=").append(typeControl);
        sb.append(", size=").append(size);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

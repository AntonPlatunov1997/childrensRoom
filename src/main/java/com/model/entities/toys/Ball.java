package com.model.entities.toys;

import com.model.entities.toys.type.Color;
import com.model.entities.toys.type.Size;

public class Ball extends Toy {

    private Color color;

    public Ball(Size size, int price, Color color) {
        super(size, price);
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

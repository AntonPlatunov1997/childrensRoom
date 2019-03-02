package com.entities.toys;

import com.entities.toys.type.Gender;
import com.entities.toys.type.Size;

public class Doll extends Toy {

    private Gender gender;

    public Doll(Size size, int price, Gender gender) {
        super(size, price);
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doll{");
        sb.append("gender=").append(gender);
        sb.append(", size=").append(size);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

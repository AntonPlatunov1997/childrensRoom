package com.services;

import com.model.entities.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class CheckingUtil {


    public int checkingCurrentPrice(List<Toy> toyList) {
        int total = 0;

        for (Toy toy : toyList) {
            total = total + toy.getPrice();

        }
        return total;
    }



}

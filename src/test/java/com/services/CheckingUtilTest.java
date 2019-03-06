package com.services;

import com.model.entities.toys.Ball;
import com.model.entities.toys.Car;
import com.model.entities.toys.Toy;
import com.model.entities.toys.type.Color;
import com.model.entities.toys.type.Size;
import com.model.entities.toys.type.TypeControl;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class CheckingUtilTest {

    ArrayList<Toy> listToys = new ArrayList();
    void fillList(){

        listToys.add(new Car(Size.SMALL, 100, TypeControl.MANUAL));
        listToys.add(new Car(Size.LARGE, 150, TypeControl.REMOTE));
        listToys.add(new Car(Size.SMALL, 120, TypeControl.REMOTE));
        listToys.add(new Car(Size.MIDDLE, 110, TypeControl.MANUAL));
        listToys.add(new Car(Size.LARGE, 200, TypeControl.REMOTE));
        listToys.add(new Car(Size.MIDDLE, 90, TypeControl.MANUAL));
        listToys.add(new Car(Size.LARGE, 140, TypeControl.REMOTE));
        listToys.add(new Ball(Size.SMALL, 40, Color.WHITE));

    }


    @Test
    public void checkingCurrentPrice() {
        fillList();
        int total = 0;
        for (Toy toy:listToys){
            total += toy.getPrice();

        }
         assertEquals(total,950);

    }


}
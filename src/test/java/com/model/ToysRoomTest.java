package com.model;

import com.model.entities.toys.*;
import com.model.entities.toys.type.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ToysRoomTest {


    @Test
    public void addToy() {
        ArrayList<Toy> listToys = new ArrayList();
        listToys.add(new Car(Size.SMALL, 100, TypeControl.MANUAL));
        listToys.add(new Ball(Size.SMALL, 40, Color.WHITE));
        listToys.add(new Block(Size.LARGE, 60, Material.PLASTIC));
        listToys.add(new Doll(Size.SMALL, 50, Gender.MALE));
        for (Toy toy:listToys){
            if (toy!=null){
                Assert.assertTrue(true);
            }
        }

    }
}
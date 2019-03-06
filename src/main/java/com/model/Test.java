package com.model;

import com.model.entities.toys.Ball;
import com.model.entities.toys.Car;
import com.model.entities.toys.Toy;
import com.model.entities.toys.type.Color;
import com.model.entities.toys.type.Size;
import com.model.entities.toys.type.TypeControl;
import com.services.SortUtil;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
 ToysRoom toysRoom = ToysRoom.getInstance();
 toysRoom.fillRoom();
 Test test = new Test();
        SortUtil sort = new SortUtil();
        test.fillList();
         int count=0;
        for (Toy toy:test.listToys){
            count=count+toy.getPrice();

        }
        System.out.println(count);







    }

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
}


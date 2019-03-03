package com.model;

import com.entities.toys.Toy;
import com.services.Sort;
import com.services.Sorts;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
 ToysRoom toysRoom = ToysRoom.getInstance();
 toysRoom.fillRoom();
        Sorts sort = new Sorts();

        for (Toy toy:toysRoom.getToyList()){
            System.out.println(toy.toString());
        }

//        System.out.println(toysRoom.checkingCurrentPrice());

        sort.sortByRange(toysRoom.getToyList(),toysRoom.getSortedListByRange());

        sort.sortByCost(toysRoom.getSortedListByRange());

        for (Toy toy:toysRoom.getSortedListByRange()){
            System.out.println(toy);
        }




    }



}

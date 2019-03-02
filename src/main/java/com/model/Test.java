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


        sort.sortByCost(toysRoom.getToyList());

        System.out.println("sortBySize----------------------------------------");
        for (Toy toy:toysRoom.getToyList()){
            System.out.println(toy.toString());
        }

        sort.sortBySize(toysRoom.getToyList());
        System.out.println("By Size----------------------------------------------");
        for (Toy toy:toysRoom.getToyList()){
            System.out.println(toy.toString());
        }

        sort.sortByRange(toysRoom.getToyList(),toysRoom.getSortedListByRange());

        System.out.println("------------------------------------BYRange");

        for (Toy toy:toysRoom.getSortedListByRange()){
            System.out.println(toy.toString());
        }


    }
}

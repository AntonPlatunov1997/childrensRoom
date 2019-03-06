package com.model;

import com.model.entities.toys.*;
import com.model.entities.toys.type.*;
import com.services.SortImpl;
import com.services.CheckingUtil;

import java.util.ArrayList;

import java.util.List;


public class ToysRoom {
    private static ToysRoom instance = new ToysRoom();
    private List<Toy> toyList;
    private List<Toy> sortedListByRange;
    private static final int BUDGET = 1800;
    private CheckingUtil checkingUtil = new CheckingUtil();


    public List<Toy> getSortedListByRange() {
        return sortedListByRange;
    }

    public static ToysRoom getInstance() {
        return instance;
    }

    private ToysRoom() {
        toyList = new ArrayList();
        sortedListByRange = new ArrayList<>();
    }




public void addToy(Toy toy){
        if (checkingUtil.checkingCurrentPrice(toyList)<=BUDGET){
            toyList.add(toy);
            if(checkingUtil.checkingCurrentPrice(toyList)>BUDGET){
                toyList.remove(toy);
            }
        }

}


public void fillRoom () {

            addToy(new Car(Size.SMALL, 100, TypeControl.MANUAL));
            addToy(new Car(Size.LARGE, 150, TypeControl.REMOTE));
            addToy(new Car(Size.SMALL, 120, TypeControl.REMOTE));
            addToy(new Car(Size.MIDDLE, 110, TypeControl.MANUAL));
            addToy(new Car(Size.LARGE, 200, TypeControl.REMOTE));
            addToy(new Car(Size.MIDDLE, 90, TypeControl.MANUAL));
            addToy(new Car(Size.LARGE, 140, TypeControl.REMOTE));
            addToy(new Ball(Size.SMALL, 40, Color.WHITE));
            addToy(new Ball(Size.MIDDLE, 60, Color.BLACK));
            addToy(new Ball(Size.LARGE, 70, Color.BLUE));
            addToy(new Ball(Size.MIDDLE, 60, Color.GREEN));
            addToy(new Ball(Size.SMALL, 20, Color.GREEN));
            addToy(new Ball(Size.MIDDLE, 60, Color.WHITE));
            addToy(new Block(Size.SMALL, 10, Material.PLASTIC));
            addToy(new Block(Size.MIDDLE, 20, Material.PLASTIC));
            addToy(new Block(Size.LARGE, 30, Material.PLASTIC));
            addToy(new Block(Size.LARGE, 30, Material.IRON));
            addToy(new Block(Size.SMALL, 10, Material.IRON));
            addToy(new Block(Size.LARGE, 60, Material.PLASTIC));
            addToy(new Doll(Size.SMALL, 50, Gender.MALE));
            addToy(new Doll(Size.LARGE, 200, Gender.FEMALE));
            addToy(new Doll(Size.LARGE, 200, Gender.FEMALE));
            addToy(new Doll(Size.MIDDLE, 200, Gender.ANOTHER));
            SortImpl sort =new SortImpl();
             sort.sortByRange(toyList,sortedListByRange);

        }


 public List<Toy> getToyList () {
            return toyList;
        }


    }


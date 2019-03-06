package com.services;

import com.model.entities.toys.Toy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortImpl implements Sort {

    @Override
    public void sortByCost(List<Toy> toyList) {
        Collections.sort(toyList, Comparator.comparingInt(Toy::getPrice));

    }

    @Override
    public void sortBySize(List<Toy> toyList) {
        Collections.sort(toyList,(o1,o2)->o2.getSize().ordinal()-o1.getSize().ordinal());
    }

    @Override
    public List<Toy> sortByRange(List<Toy> toyList,List<Toy> sortedListByRange) {

        for (Toy toy:toyList){
            if ((toy.getPrice()<=100)&&(toy.getPrice()>=60)){
                sortedListByRange.add(toy);
            }

        }


        return sortedListByRange;
    }
}

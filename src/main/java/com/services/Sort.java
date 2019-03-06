package com.services;

import com.model.entities.toys.Toy;

import java.util.List;

public interface Sort {
    void sortByCost(List<Toy> toyList);
    void sortBySize(List<Toy> toyList);
     List sortByRange(List<Toy> toyList,List<Toy> sortedListByRange);
}

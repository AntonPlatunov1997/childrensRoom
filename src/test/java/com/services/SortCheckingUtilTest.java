package com.services;

import com.model.entities.toys.*;
import com.model.entities.toys.type.*;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;

public class SortCheckingUtilTest {


  SortImpl sortImpl = new SortImpl();
    ArrayList<Toy> listToys = new ArrayList();
    ArrayList<Toy> listToysByRange= new ArrayList<>();

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
    void fillListByRange(){

        for (Toy toy:listToys){
            if ((toy.getPrice()<=100)&&(toy.getPrice()>=60)){
                listToysByRange.add(toy);
            }

        }
    }

    @Test
    public void sortByCost() {
     fillList();
     sortImpl.sortByCost(listToys);
     for (int i=0;i<listToys.size()-1;i++){
         if (listToys.get(i).getPrice()>listToys.get(i+1).getPrice()){
             fail();
         }

     }



    }

    @Test
    public void sortBySize() {
        fillList();
        sortImpl.sortBySize(listToys);
        for (int i=0;i<listToys.size()-1;i++){
            if (listToys.get(i).getSize().ordinal()<listToys.get(i+1).getSize().ordinal()){
                fail();

            }
        }
    }

    @Test
    public void sortByRange() {
        fillListByRange();
          for (int i =0;i<listToysByRange.size();i++){
              if (listToysByRange.get(i).getPrice()>100 | listToysByRange.get(i).getPrice()<60){
                  fail();
              }
          }
    }
}
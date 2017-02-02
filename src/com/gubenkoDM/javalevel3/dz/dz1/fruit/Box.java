package com.gubenkoDM.javalevel3.dz.dz1.fruit;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Nestor on 21.01.2017.
 */
public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox=new ArrayList<>();
    private int fruitNum;
    private float fruitWeight;
    private T fruit;


    public Box(T fruit){
        this.fruit=fruit;
    }

    public Box(int fruitNum, T fruit ) {
        this.fruitNum = fruitNum;
        this.fruit=fruit;
        fruitBox.ensureCapacity(fruitNum);
        //fruitBox.trimToSize();

        //заполним коробку фруктами
        fillBox();
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    /**
     * Fill Box
     */
    private void fillBox(){
        for (int i = 0; i <fruitNum; i++) {
            fruitBox.add(fruit);
        }
    }

    /**
     * Get fruit box weight
     */

    public float getWeight(ArrayList<?> fruitB){
        float weight=0;

        //а не пустая ли коробочка?:)
        if (fruitB.isEmpty()){
            return 0.0f;
        }
        //определим вес переданного в коробку фрукта
        if (fruitB.get(0) instanceof Apple){
            fruitWeight=fruit.weight;
        }else if(fruitB.get(0) instanceof Orange){
            fruitWeight=fruit.weight;
        }else {
            fruitWeight=fruit.weight;
        };


        for (int i = 0; i<fruitBox.size() ; i++) {
            weight+=fruitWeight;
        }
        return weight;
    }



    /**
     * Compare fruit box
     */
    public boolean compare(ArrayList<?> fruitBoxAn){
       return getWeight(fruitBox)==getWeight(fruitBoxAn);
    }

    public void pourFruit(ArrayList<T> fruitBoxAn){
        for (int i = 0; i <fruitBox.size() ; i++) {
            fruitBoxAn.add(fruitBox.get(i));
        }
        fruitBox.clear();
    }






}

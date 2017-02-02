package com.gubenkoDM.javalevel3.dz.dz1;

/**
 * Created by Nestor on 18.01.2017.
 */
public class Cat {
    private String name;
    private int size;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void getVoice(){
        System.out.println("Мяу!");
    }
}

package com.gubenkoDM.javalevel3.dz.dz1;

import java.util.Arrays;

/**
 * Created by Nestor on 19.01.2017.
 */
public class Reverser<T> {
    private T[] arr;

    public Reverser(T[] arr) {
        this.arr=arr;
    }

    public void reverseElem(T[] testArr, int fE, int tE ){
        T buf=testArr[fE];
        testArr[fE]=testArr[tE];
        testArr[tE]=buf;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}

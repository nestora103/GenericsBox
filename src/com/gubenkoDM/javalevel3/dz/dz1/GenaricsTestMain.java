package com.gubenkoDM.javalevel3.dz.dz1;

import com.gubenkoDM.javalevel3.dz.dz1.fruit.Apple;
import com.gubenkoDM.javalevel3.dz.dz1.fruit.Box;
import com.gubenkoDM.javalevel3.dz.dz1.fruit.Orange;

import java.util.*;

/**
 * Created by Nestor on 18.01.2017.
 */
public class GenaricsTestMain {
    private static Random rand=new Random();
    private static final int ARRSIZE=500;

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int arrSize=rand.nextInt(ARRSIZE);

        Integer[] testArrI=new Integer[arrSize];
        fillArrI(testArrI);
        System.out.println('1');
        System.out.println("Тип:"+testArrI.getClass().getName());
        System.out.println(Arrays.toString(testArrI));

        String[] testArrS=new String[arrSize];
        fillArrS(testArrS);
        System.out.println('2');
        System.out.println("Тип:"+testArrS.getClass().getName());
        System.out.println(Arrays.toString(testArrS));

        Cat[] testArrCat=new Cat[arrSize];
        fillArrCat(testArrCat);
        System.out.println('3');
        System.out.println("Тип:"+testArrCat.getClass().getName());
        System.out.println(Arrays.toString(testArrCat));

        System.out.println("В массиве ".concat(Integer.toString(arrSize)).concat(" элементов"));
        Scanner sc=new Scanner(System.in);

        int fE;
        int tE;

        while (true){
            System.out.println("Введите 2 числа в диапазоне выше для переcтановки в след формате; #1элемента #2элемента");
            fE=Integer.parseInt(sc.next());
            tE=Integer.parseInt(sc.next());
            if ((fE>=0)&&(fE<ARRSIZE)&&(tE>=0)&&(tE<ARRSIZE)){
                break;
            }else {
                System.out.println("Ошибка!");
            }
        }


        Reverser<Integer> revI=new Reverser<>(testArrI);
        revI.reverseElem(testArrI,fE,tE);
        System.out.println(Arrays.toString(testArrI));

        Reverser<String> revS=new Reverser<>(testArrS);
        revS.reverseElem(testArrS,fE,tE);
        System.out.println(Arrays.toString(testArrS));

        Reverser<Cat> revC=new Reverser<>(testArrCat);
        revC.reverseElem(testArrCat,fE,tE);
        System.out.println(Arrays.toString(testArrCat));

        System.out.println("Задание 2");

        System.out.println('1');
        System.out.println("Тип:"+testArrI.getClass().getName());
        System.out.println(arrayToArrayList(testArrI).toString());

        System.out.println('2');
        System.out.println("Тип:"+testArrS.getClass().getName());
        System.out.println(arrayToArrayList(testArrS).toString());

        System.out.println('3');
        System.out.println("Тип:"+testArrCat.getClass().getName());
        System.out.println(arrayToArrayList(testArrCat).toString());


        System.out.println("Задание 3");
        //работаем с яблоками
        Box<Apple> fruitBoxA=new Box<>(10,new Apple());
        //апельсинами
        Box<Orange> fruitBoxO=new Box<>(20,new Orange());

        System.out.println("Вес коробки яблок:"+fruitBoxA.getWeight(fruitBoxA.getFruitBox()));
        System.out.println("Вес коробки апельсинов:"+fruitBoxO.getWeight(fruitBoxO.getFruitBox()));

        System.out.println("Равна ли по весу коробка с яблоками коробке с апельсинами?:"+fruitBoxA.compare(fruitBoxO.getFruitBox()));

        //создадим пустую коробку
        Box<Apple> fruitBoxAEmpty=new Box<>(new Apple());

        //пересыпим яблоки в пустую коробку
        fruitBoxA.pourFruit(fruitBoxAEmpty.getFruitBox());

        //посчитаем вес фруктов в теперь уже не пустой коробке
        System.out.println("Вес фруктов в пересыпаной коробке:"+fruitBoxAEmpty.getWeight(fruitBoxAEmpty.getFruitBox()));

        System.out.println("Вес фруктов в старой коробке с фруктами:"+fruitBoxA.getWeight(fruitBoxA.getFruitBox()));
    }

    private static <T> ArrayList<T> arrayToArrayList(T[] inputArr){
        ArrayList<T> arrl=new ArrayList<>();
        Collections.addAll(arrl,inputArr);
        return arrl;
    }

    private static void fillArrI(Integer[] arrI){
        for(int i=0;i<arrI.length;i++){
            arrI[i]=rand.nextInt(1001);
        }
    }

    private static void fillArrS(String[] arrS){
        for(int i=0;i<arrS.length;i++){
            arrS[i]=Integer.toString(rand.nextInt(1001));
        }
    }

    private static void fillArrCat(Cat[] arrCat){
        for(int i=0;i<arrCat.length;i++){
            arrCat[i]=new Cat("Кот"+i,rand.nextInt(1001));
        }
    }





}

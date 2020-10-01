package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    public static void main(String[] args) {
        DIntArray testObjArray = new DIntArray();

        //System.out.println(testObjArray);
        testObjArray.add(1);
       // System.out.println(testObjArray.toString());
        testObjArray.add(3);
        //System.out.println(testObjArray.toString());
        testObjArray.add(4);
        //System.out.println(testObjArray.toString());
        testObjArray.add(10);
        System.out.println(testObjArray.toString());

        testObjArray.atInsert(1, 0);
        System.out.println(testObjArray.toString());
        testObjArray.atInsert(0, 5);
        System.out.println(testObjArray.toString());
        testObjArray.atInsert(3, 111);
        System.out.println(testObjArray.toString());

        testObjArray.atDelete(3);
        System.out.println(testObjArray.toString());
        testObjArray.atDelete(1);
        System.out.println(testObjArray.toString());
    }

    //Переменные класса
    private int[] array;

    //Конструктор класса
        public DIntArray(){
          array = new int[0];    //Определяю исходный массив размером 0
        }

    //Метод для добавления элемента в конец массива
    public void add(int num){
        System.out.println(num);
        //Вариант с промежуточным массивом
        /* int[] addArray = Arrays.copyOf(array, array.length + 1);
        addArray[addArray.length - 1] = num;
        this.array = Arrays.copyOf(addArray, addArray.length);  */

        //Путем экспериментов пришел к тому, что можно переопределить массив массивом с другой длиной!
        //В данном случае копирую сам в себя, но заявляю больший размер
        this.array = Arrays.copyOf(this.array, this.array.length + 1);
        this.array[this.array.length - 1] = num;
    }

    //Метод для добавления элемента в указанную позицию массива
    public void atInsert(int pos, int num){
        System.out.println("Добавляю в позицию " + pos + " число " + num);
        this.array = Arrays.copyOf(this.array, this.array.length + 1);
        for (int i = this.array.length - 1; i > pos ; i-- ){
            this.array[i] = this.array[i] + this.array[i - 1];
            this.array[i - 1] = this.array[i] - this.array[i - 1];
            this.array[i] = this.array[i] - this.array[i - 1];
        }
        this.array[pos] = num;
    }

    //
    public void atDelete(int pos){
        System.out.println("Удаляю элемент в позиции " + pos);
        for (int i = pos; i < this.array.length - 1 ; i++ ){
            this.array[i] = this.array[i] + this.array[i + 1];
            this.array[i + 1] = this.array[i] - this.array[i + 1];
            this.array[i] = this.array[i] - this.array[i + 1];
        }
        //System.out.println(Arrays.toString(this.array));
        this.array = Arrays.copyOf(this.array, this.array.length - 1);
    }

    //
    public int at(int pos){
        return pos;
    }

    @Override
    public String toString(){

        return Arrays.toString(array);
    }
}

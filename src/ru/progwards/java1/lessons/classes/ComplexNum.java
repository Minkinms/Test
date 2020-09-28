package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    public static void main(String[] args) {
        ComplexNum complexA = new ComplexNum(50, 10);
        ComplexNum complexB = new ComplexNum(2, 6);
        ComplexNum complexC = new ComplexNum(20, 9);

        System.out.println(complexA.toString());
        System.out.println(complexB.toString());

        System.out.println(complexA.add(complexB));         //Выводит то, что нужно, хотя метод toString не вызывается
        System.out.println(complexB.sub(complexC));


    }

    //переменные класса
    int realPartNumber;         //Действительная часть числа
    int imaginaryPartNumber;    //Мнимая часть числа


    //Конструктор класса
    public ComplexNum(int a, int b) {
        this.realPartNumber = a;
        this.imaginaryPartNumber = b;
    }

    public String toString() {                                              //TODO:возможно нужны условия для (-) и "0"
        return this.realPartNumber + "+" + this.imaginaryPartNumber + "i";
    }

    //метод для сложения комплексных чисел
    //используется формула (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num) {
        //Введены вспомогательные переменные для работы с вещественной и мнимой частями
        int addRealPart = this.realPartNumber + num.realPartNumber;
        int addImaginaryPart = this.imaginaryPartNumber + num.imaginaryPartNumber;

        //Результат вывожу в формате ComplexNum, поэтому для записи результата создаю новый экземпляр ComplexNum
        return new ComplexNum(addRealPart, addImaginaryPart);
    }

    //метод для вычитания комплексных чисел
    //используется формула (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num) {
        //Введены вспомогательные переменные для работы с вещественной и мнимой частями
        int addRealPart = this.realPartNumber - num.realPartNumber;
        int addImaginaryPart = this.imaginaryPartNumber - num.imaginaryPartNumber;

        //Результат вывожу в формате ComplexNum, поэтому для записи результата создаю новый экземпляр ComplexNum
        return new ComplexNum(addRealPart, addImaginaryPart);
    }


}

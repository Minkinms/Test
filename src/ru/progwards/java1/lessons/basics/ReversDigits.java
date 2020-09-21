package ru.progwards.java1.lessons.basics;

public class ReversDigits {
    public static void main(String[] args) {
        //System.out.println(reversDigits(569));
    }

    public static int reversDigits(int number){
        // 1. Определяем остаток отделения на 10 и получаем последнюю цифру. Это сотни, поэтому в ответе умножаем на 100
        // 2. Делим на 10 с присвоением. Перезаписываем Number и отрезаем таким образом последнюю цифру.
        // Далее определяем остаток от деления уже двух первых цифр и получаем вторую цифру числа. Это десятки, умножаем на 10.
        // 3. Перезаписанный Number (с двумя цифрами) делим на 10 и получаем первую цифру.
        return 100*(number%10) + 10*((number/=10)%10) + number/10;
    }
}

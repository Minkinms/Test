package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        //Тест maxSide()
        System.out.println("Тест maxSide()");
        System.out.println(maxSide(1, 3, 5));     //c>b>a
        System.out.println(maxSide(3, 1, 5));     //a>b<c
        System.out.println(maxSide(5, 3, 1));     //a>b>c
        System.out.println(maxSide(1, 5, 3));     //b>c>a
        System.out.println(maxSide(3, 5, 1));     //b>a>c
        System.out.println(maxSide(1, 1, 5));     //a=b<c
        System.out.println(maxSide(1, 5, 5));     //a<b=c
        System.out.println(maxSide(5, 5, 5));     //a=b=c

        //Тест minSide()
        System.out.println("Тест minSide()");
        System.out.println(minSide(1, 3, 5));     //c>b>a
        System.out.println(minSide(5, 3, 1));     //a>b>c
        System.out.println(minSide(1, 5, 3));     //b>c>a
        System.out.println(minSide(3, 5, 1));     //b>a>c
        System.out.println(minSide(1, 1, 5));     //a=b<c
        System.out.println(minSide(1, 1, 1));     //a=b=c

        //Тест isEquilateralTriangle()
        System.out.println("Тест isEquilateralTriangle()");
        System.out.println(isEquilateralTriangle(1, 3, 5));     //c>b>a
        System.out.println(isEquilateralTriangle(5, 3, 1));     //a>b>c
        System.out.println(isEquilateralTriangle(1, 5, 3));     //b>c>a
        System.out.println(isEquilateralTriangle(3, 3, 3));     //a=b=c

    }

    //Определение наибольшей длины сторон треугольника
    public static int maxSide(int a, int b, int c) {
        int maxSide = 0;
 /*
        if ((a - b) > 0) {       //Вычисляем разницу между "а" и "b"
            if ((a - c) > 0) {   //Если "а" больше "b", то сравниваем "а" и "с"
                maxSide = a;     //Если "а" больше "с", то возвращаем "а"
            } else {
                maxSide = c;     //Если "c" больше "a", то возвращаем "c"
            }
        } else {                 //Если "b" больше "a" (значение отрицательное), то сравниваем "b" и "с"
            if ((b - c) > 0) {
                maxSide = b;     //Если "b" больше "с", то возвращаем "b"
            } else {
                maxSide = c;     //Если "c" больше "b", то возвращаем "c"
            }
        }
 */
           //Реализована последовательная проверка значений разницы длин сторон с условием выполнения обоих равенств
           if ((a - b) >= 0  && (a - c) >= 0) {
               maxSide = a;
           }
           if ((b - a) >= 0  && (b - c) >= 0) {
               maxSide = b;
           }
           if ((c - a) >= 0  && (c - b) >= 0) {
               maxSide = c;
           }

        return maxSide;
    }

    //Определение наименьшей длины сторон треугольника
    public static int minSide(int a, int b, int c) {
        int minSide = 0;

   /*     if ((a - b) < 0) {       //Вычисляем разницу между "а" и "b"
            if ((a - c) < 0) {   //Если "а" меньше "b", то сравниваем "а" и "с"
                minSide = a;     //Если "а" меньше "с", то возвращаем "а"
            } else {
                minSide = c;     //Если "c" меньше "а", то возвращаем "c"
            }
        } else {                 //Если "а" больше "b" (значение положительное), то сравниваем "b" и "с"
            if ((b - c) < 0) {
                minSide = b;     //Если "b" меньше "с", то возвращаем "b"
            } else {
                minSide = c;     //Если "c" меньше "b", то возвращаем "c"
            }
        }
    */
        //Реализована последовательная проверка значений разницы длин сторон с условием выполнения обоих равенств
        if ((a - b) <= 0  && (a - c) <= 0) {
            minSide = a;
        }
        if ((b - a) <= 0  && (b - c) <= 0) {
            minSide = b;
        }
        if ((c - a) <= 0  && (c - b) <= 0) {
            minSide = c;
        }

        return minSide;
    }

    //Определение равностороннего треугольника
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean triangleIsEquilateral;

        //Реализована последовательная проверка равенства сторон с условием выполнения обоих равенств
        if ((a == b) && (a == c)) {
            triangleIsEquilateral = true;
        } else {
            triangleIsEquilateral = false; //если  одно из условий не выполнено, то значение false
        }

        return triangleIsEquilateral;
    }

}

package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    //Результаты сравнения
    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER
    }

    //Метод для сравнения животных по весу
    public CompareResult compareWeight(CompareWeight smthHasWeight);

}

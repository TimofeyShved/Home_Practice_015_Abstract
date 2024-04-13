package com.company;

public class Main {

    public interface Function {
        //Метод интерфейса  с отсутсвующей реализацией
        int apply();
    }

    public static <T> void fill(T[] objects, Function function) {
        for(int i = 0; i < objects.length; i++){
            //objects[i] = function.apply(i);
        }
    }

    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        //fill(squares, ); // 0, 1, 4, 9, 16 .....

        // в данном случае мы видим как вызывается анонимная функция, то есть лямбда выражение
    }
}

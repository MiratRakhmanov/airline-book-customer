package com.mirat.homework;

import java.util.List;

public class View {

    public static <T> void print(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}

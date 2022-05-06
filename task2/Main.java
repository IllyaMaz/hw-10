package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan","Illya","Egor","Misha","Anton","Vitaliy");

        Function<List<String>,List<String>> function = list1 -> {
            int point = 0;
            List<String> result = new ArrayList<>();
            for (String s: list1) {
                result.add(list1.get(point).toUpperCase());
                point++;
            }
            Collections.sort(result,Collections.reverseOrder());
            return result;
        };

        System.out.println(function.apply(list));
    }
}

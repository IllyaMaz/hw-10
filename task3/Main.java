package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	String[] arr = new String[]{"3,2,1","5,4"};

        Function<String[],String> function = arrays -> {
            String[] strings = new String[0];
            List<String> list = new ArrayList<>();
            for (int i = 0; i < arrays.length; i++) {
                strings = arrays[i].split(",");
                for (int j = 0; j < strings.length; j++) {
                    list.add(strings[j]);
                }
            }
            Collections.sort(list);
            String s = String.valueOf(list).replace("[","").replace("]","");
            return s;
        };
        System.out.println(function.apply(arr));
    }
}

package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan","Egor","Denis","Anton","Vitaliy","Ilya");

        Function<List<String>,String> function = list1 -> {
            int point = 0;
            String result ="";
            for ( String s : list1) {
                if (point % 2 !=0){
                    result += point+"."+s+", ";
                }
                point++;
            }
            return result;
        };

        System.out.println(function.apply(list));


    }
}

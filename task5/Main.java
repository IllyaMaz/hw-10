package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> first = Arrays.asList(1,2,3,4,5).stream();
        Stream<Integer> second = Arrays.asList(6,7,8,9,10,11,12,13).stream();

        List<Integer> list = zip(first,second).collect(Collectors.toList());
        System.out.println(list);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
       List<T> firstList = first.collect(Collectors.toList());
       List<T> secondList = second.collect(Collectors.toList());
       List<T> result = new ArrayList<>();
       int point = firstList.size() > secondList.size() ? secondList.size() : firstList.size();
        for (int i = 0; i < point; i++){
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        return result.stream();
    }
}

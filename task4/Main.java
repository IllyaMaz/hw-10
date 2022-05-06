package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        getRandom(25214903917L,11,2^48,0).forEach(System.out::println);

    }

    public static Stream<Long> getRandom(long a,long c,long m,long seed){
        return Stream.iterate(seed,x->(a * ( x + c ) % m));
    }
}

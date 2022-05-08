package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(Math.round(-1.5));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).limit(3).collect(Collectors.toList());
        System.out.println(squaresList);


    }
}

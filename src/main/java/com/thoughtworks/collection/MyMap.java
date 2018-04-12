package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream()
                .map(num -> num * 3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream()
                .map(num -> String.valueOf((char)('a' + num - 1)))
                .collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream()
                .map(num ->
                {
                    String result = "";
                    while (num != 0) {
                        int remain = num%26;
                        if(remain == 0)remain = 26;
                        result = String.valueOf((char)('a' + remain - 1)) + result;
                        num = (num - remain) / 26;
                    }
                    return result;
                })
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array);
        Collections.reverse(array);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}

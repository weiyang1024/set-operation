package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> even_list = this.array.stream()
                .filter(num -> num % 2 == 0).map(num -> num).collect(Collectors.toList());
        return even_list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = this.array.stream()
                .filter(num -> num % 3 == 0).map(num -> num).collect(Collectors.toList());
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = firstList.stream()
                .filter(num -> secondList.contains(num)).map(num -> num).collect(Collectors.toList());
        return result;

    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<>();
        for(Integer cur_num:this.array)
            if(!result.contains(cur_num))
                result.add(cur_num);
        return result;
    }
}
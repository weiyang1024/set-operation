package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        int min_num = left;
        int max_num = right;
        int step = 1;
        if (left > right) {
            min_num = right;
            max_num = left;
            step = -1;
        }
        for (int i = min_num; i <= max_num; ++i) {
            result.add(left);
            left += step;
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        int min_num = left;
        int max_num = right;
        int step = 1;
        if (left > right) {
            min_num = right;
            max_num = left;
            step = -1;
        }
        for (int i = min_num; i <= max_num; ++i) {
            if (left % 2 == 0)
                result.add(left);
            left += step;
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0)
                result.add(i);
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        int i, j;
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        for (i = 0, j = 0; i < firstArray.length && j < secondArray.length; ) {
            if (firstArray[i] == secondArray[j]) {
                result.add(firstArray[i]);
                i++;
                j++;
            } else if (firstArray[i] > secondArray[j])
                j++;
            else
                i++;
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> first_list = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> second_list = Arrays.asList(secondArray);
        for(int i = 0;i < second_list.size();++i)
            if(!first_list.contains(second_list.get(i)))
                first_list.add(second_list.get(i));
        return first_list;
    }
}

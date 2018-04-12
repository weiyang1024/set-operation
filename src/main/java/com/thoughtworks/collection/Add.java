package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int minNum = leftBorder <= rightBorder ? leftBorder : rightBorder;
        int maxNum = leftBorder <= rightBorder ? rightBorder : leftBorder;
        if (minNum % 2 == 1)
            minNum += 1;
        int sum = 0;
        for (int i = minNum; i <= maxNum; i = i + 2)
            sum += i;
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int minNum = leftBorder <= rightBorder ? leftBorder : rightBorder;
        int maxNum = leftBorder <= rightBorder ? rightBorder : leftBorder;
        if (minNum % 2 == 0)
            minNum += 1;
        int sum = 0;
        for (int i = minNum; i <= maxNum; i = i + 2)
            sum += i;
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList)
            sum += i * 3 + 2;
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i) % 2 == 1)
                arrayList.set(i, arrayList.get(i) * 3 + 2);
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i) % 2 == 1)
                sum += arrayList.get(i) * 3 + 5;
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i)
            if (arrayList.get(i) % 2 == 0)
                result.add(arrayList.get(i));
        if (result.size() % 2 == 1)
            return (double) result.get(result.size() / 2);
        else
            return (double) ((result.get(result.size() / 2) + result.get(result.size() / 2 - 1)) / 2);
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int num = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i)
            if (arrayList.get(i) % 2 == 0) {
                sum += arrayList.get(i);
                num++;
            }
        double average = (double) sum / num;
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> even_list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i)
            if (arrayList.get(i) % 2 == 0)
                even_list.add(arrayList.get(i));
        return even_list.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> even_list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i)
            if (arrayList.get(i) % 2 == 0)
                even_list.add(arrayList.get(i));
        Set<Integer> even_set = new HashSet(even_list);
        List<Integer> result_list = new ArrayList(even_set);
        return result_list;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> result_list = new ArrayList<>();
        List<Integer> odd_list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i)
            if (arrayList.get(i) % 2 == 0)
                result_list.add(arrayList.get(i));
            else
                odd_list.add(arrayList.get(i));
        Collections.sort(result_list);
        Collections.sort(odd_list);
        for (int i = odd_list.size() - 1; i >= 0; --i)
            result_list.add(odd_list.get(i));
        return result_list;

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; ++i)
            result.add(3 * (arrayList.get(i) + arrayList.get(i + 1)));

        return result;

    }
}

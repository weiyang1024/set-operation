package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().reduce(Integer::max).orElse(0);
    }

    public double getMinimum() {
        return arrayList.stream().reduce(Integer::min).orElse(0);
    }

    public double getAverage() {
        return ((double)arrayList.stream().reduce(Integer::sum).orElse(0))/arrayList.size();
    }

    public double getOrderedMedian() {
        if (arrayList.size() % 2 == 1)
            return (double) arrayList.get(arrayList.size() / 2);
        else
            return ((double) (arrayList.get(arrayList.size() / 2) + arrayList.get(arrayList.size() / 2 - 1)))/ 2;
    }

    public int getFirstEven() {
        List<Integer> first_list = arrayList.stream()
                .filter(num -> num % 2 ==0)
                .collect(Collectors.toList());
        return first_list.get(0);
    }

    public int getIndexOfFirstEven() {
        for(int i = 0;i < arrayList.size();++i)
            if(arrayList.get(i)%2 == 0)
                return i;
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size() != arrayList.size())
            return false;
        for(int i = 0;i < arrayList.size() - 1;++i)
            if(this.arrayList.get(i) != arrayList.get(i))
                return false;
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        //测试函数功能
        for(int i = 0;i < 12;++i)
            singleLink.addTailPointer(arrayList.get(i));
        if (arrayList.size() % 2 == 1)
            return (double) arrayList.get(arrayList.size() / 2);
        else
            return ((double) (arrayList.get(arrayList.size() / 2) + arrayList.get(arrayList.size() / 2 - 1)))/ 2;
    }

    public int getLastOdd() {
        List<Integer> first_list = arrayList.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());
        return first_list.get(first_list.size() - 1);

    }

    public int getIndexOfLastOdd() {
        int index = -1;
        for(int i = 0;i < arrayList.size();++i)
            if(arrayList.get(i)%2 == 1)
                index = i;
        return index;
    }
}

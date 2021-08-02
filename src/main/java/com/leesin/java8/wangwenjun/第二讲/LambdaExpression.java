package com.leesin.java8.wangwenjun.第二讲;

import com.leesin.java8.wangwenjun.第一讲.Apple;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by wangwenjun on 2016/10/12.
 */
public class LambdaExpression {

    public static void main(String[] args) {

        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };

        List<Apple> list = Collections.emptyList();

        list.sort(byColor);


        /**
         *                           参数列表               lambda body（如果是{}， 必须有return，如果有return，必须用{}包着）
         */
        Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());


        Function<String, Integer> flambda = s -> s.length();
        Predicate<Apple> p = (Apple a) -> a.getColor().equals("green");
        Runnable r = ()->{};
        Function<Apple,Boolean> f = (a)->a.getColor().equals("green");

    }
}

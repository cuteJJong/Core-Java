package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private List<Product> list;         //초기값
    public Sort(List<Product> list) {
        this.list = list;
    }

    public void quickSort() {
        //anonymous 사용
        Collections.sort(this.list, new Comparator<Product>(){

            @Override
            public int compare(Product front, Product back) {       //back - front 내림차순
                return back.getBenefit() - front.getBenefit();        //기준
            }
        });
    }
}

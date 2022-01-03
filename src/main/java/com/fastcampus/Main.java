package com.fastcampus;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Sort<String> bsort = new JavaSort<>();
        //args = new String[]{"3", "4", "2", "1", "5"};
        System.out.println("[result] " + bsort.sort(Arrays.asList(args)));
    }
}
package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> numbersOnlyEven = new ArrayList<Integer>();
        for(Integer number : numbers){
            if (number % 2 == 0){
                numbersOnlyEven.add(number);
            }
        }
    return numbersOnlyEven;
    }
}

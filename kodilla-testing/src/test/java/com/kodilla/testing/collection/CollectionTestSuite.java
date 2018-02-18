package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    public static int testCounter;

@Before
    public void beforeOddNumbersTest(){
    testCounter++;
    System.out.println("Executing test number " + testCounter);
    }
@After
    public void afterOddNumbersTest(){
    System.out.println("Finished test numer " + testCounter);
}
@Test
    public void testOddNumbersExterminatorEmptyList(){
    //Given
    List<Integer>numbers = new ArrayList<Integer>();
    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
    //When
    List<Integer>result = oddNumbersExterminator.exterminate(numbers);
    //Then
    Assert.assertEquals(0,result.size());
}
@Test
    public void testOddNumbersExterminatorNormalList(){

    //Given
    List<Integer>numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    numbers.add(0);
    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
    List<Integer> expectedNumbers = new ArrayList<>();
    expectedNumbers.add(4);
    expectedNumbers.add(2);
    expectedNumbers.add(0);
    //When
    List<Integer>result = oddNumbersExterminator.exterminate(numbers);
     //Then
    Assert.assertEquals(expectedNumbers,result);
}
}



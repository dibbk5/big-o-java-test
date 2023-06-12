package com.example.bigojavatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTests {

    private MissingNumber missingNumber = new MissingNumber();
    int[] noEight = new int[]{1,2,3,4,5,6,7,9,10};
    private int[] noOne = {2,3,4,5,6,7,8,9,10};
    private int[] noTen = {1,2,3,4,5,6,7,8,9};

    @Test
    public void missingNumberTest_NoEight (){
        assertEquals(8, missingNumber.missingNumber(noEight, 10));
    }


    @Test
    public void missingNumberTest_NoOne (){
        assertEquals(1, missingNumber.missingNumber(noOne, 10));
    }


    @Test
    public void missingNumberTest_NoTen (){
        assertEquals(10, missingNumber.missingNumber(noTen, 10));
    }
}

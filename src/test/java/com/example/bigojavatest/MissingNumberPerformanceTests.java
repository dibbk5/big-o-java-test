package com.example.bigojavatest;

import org.junit.Test;

public class MissingNumberPerformanceTests {

    private MissingNumber missingNumber = new MissingNumber();
    private int[] noEight = {1,2,3,4,5,6,7,9,10};
    private int[] noOne = {2,3,4,5,6,7,8,9,10};
    private int[] noTen = {1,2,3,4,5,6,7,8,9};

    @Test(timeout=1000)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            missingNumber.missingNumber(noEight, 10);
            missingNumber.missingNumber(noOne, 10);
            missingNumber.missingNumber(noTen, 10);
        }
    }

    @Test(timeout=1000)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            missingNumber.missingNumberSort(noEight, 10);
            missingNumber.missingNumberSort(noOne, 10);
            missingNumber.missingNumberSort(noTen, 10);
        }
    }

    @Test(timeout=1000)
    public void testMissingNumberSum_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            missingNumber.missingNumberSum(noEight, 10);
            missingNumber.missingNumberSum(noOne, 10);
            missingNumber.missingNumberSum(noTen, 10);
        }
    }

}

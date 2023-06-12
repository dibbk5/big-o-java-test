package com.example.bigojavatest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DataStructuresTests {

    DataStructures dataStructures = new DataStructures();
    private String input;
    private boolean expectedOutput;

    public DataStructuresTests(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testConditions() {
    String noOpen = "dkljfsk>";
    String noClose = "(jdlfkajd";
    String good = "[akldjflk]";

    Object[][] expectedOutputs = {
            {noOpen, false},
            {noClose, false},
            {good, true}
    };
    return Arrays.asList(expectedOutputs);
    }

    @Test
    public void dataStructureTest_Parameterized() {
        assertEquals(expectedOutput, dataStructures.balancedBrackets(input));
    }

//    @Test
//    public void dataStructureTest_NoOpen() {
//        assertFalse(dataStructures.balancedBrackets(noOpen));
//    }
//
//    @Test
//    public void dataStructureTest_NoClose() {
//        assertFalse(dataStructures.balancedBrackets(noClose));
//    }
//
//    @Test
//    public void dataStructureTest_Good() {
//        assertTrue(dataStructures.balancedBrackets(good));
//    }
}

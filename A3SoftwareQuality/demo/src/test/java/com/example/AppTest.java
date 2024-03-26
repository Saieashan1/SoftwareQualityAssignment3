package com.ontariotechu.sofe3980U;

import java.time.format.TextStyle;

import static org.junit.Assert.*; 

import org.junit.Test;



public class AppTest {

    @Test //TC1
    public void testCountCharOccurrences_SingleNodeCoverage() {
        char[] array = {'a', 'b', 'c', 'd', 'a', 'a'};
        assertEquals(3, App.countCharOccurrences(array, 'a'));
    }

    @Test //TC2
    public void testCountCharOccurrences_SingleEdgeCoverage() {
        char[] array = {'a', 'b', 'c', 'c', 'd', 'd'};
        assertEquals(1, App.countCharOccurrences(array, 'b'));
    }

    @Test //TC3 
    public void testCountCharOccurrences_SingleEdgePairCoverage() {
        char[] array = {'a', 'b', 'c', 'a', 'b', 'a'};
        assertEquals(0, App.countCharOccurrences(array, 'd'));
    }

    @Test //TC4
    public void testCountCharOccurrences_PrimePathsCoverage() {
        char[] array = {'a', 'b', 'b', 'c', 'a', 'a'};
        assertEquals(0, App.countCharOccurrences(array, 'd'));
    }
}
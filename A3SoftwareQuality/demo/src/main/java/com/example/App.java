package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import org.joda.time.*; 

public class App {
    public static int countCharOccurrences(char[] array, char target) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

}

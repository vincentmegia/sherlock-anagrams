package com.vincentmegia;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int process(String text) throws UnsupportedEncodingException {
        //build list of permutation
        Map<String, Integer> store = new HashMap<>();
        var length = text.length();
        for (int i = 0; i <= length; i++) {
            for (int j = i + 1; j <= length; j++) {
                char tempArray[] = text.substring(i, j).toCharArray();
                Arrays.sort(tempArray);
                String key = new String(tempArray);
                store.computeIfAbsent(key, x -> 0);
                store.computeIfPresent(key, (x, y) -> y + 1);
            }
        }
        int counter = 0;
        for (int n : store.values()) {
            int summation = (n*(n+1))/2;
            summation = summation - n;
            counter += summation;
        }
        return counter;
    }
}

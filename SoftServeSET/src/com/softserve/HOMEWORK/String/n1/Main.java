package com.softserve.HOMEWORK.String.n1;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;
public class Main {
    public static void main(String[] args) {
        String line = "London is the capital of ";
        String[] words = line.split(" ");
        String maxWord = "ef";
        for (String word : words)
            if (maxWord.length() < word.length())
                maxWord = word;
        System.out.println("the longest word: " + maxWord);
        System.out.println("the number of letters in the longest word: " + maxWord.length());
        System.out.println("The second word in reverse: " + words[1]);
    }
}





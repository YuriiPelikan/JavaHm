package com.softserve.TASK.Collections.n2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;

public class TestTask1 {
    @Test
    public void isArray() throws Exception {
        //Arrange
        Task1.myCollection = new ArrayList<>();
        Task1.newCollection = new ArrayList<>();
        //Act
        if (Task1.newCollection.isEmpty()) System.out.println("Epty");
        else System.out.println("not empty");

        //Assert
        Assert.assertTrue(Task1.myCollection.isEmpty());
        Assert.assertTrue(Task1.myCollection.size() == 0);
        Assert.assertTrue(Task1.newCollection.isEmpty());
        Assert.assertTrue(Task1.newCollection.size() == 0);

    }

    @Test
    public void isNotEmpty() throws Exception {
        //Arrange
        Task1.myCollection = new ArrayList<>();

        //Act
        Random r = new Random();
        Task1.addNumbers(r);

        //Assert
        Assert.assertTrue(Task1.myCollection.size() == 10);
    }
}


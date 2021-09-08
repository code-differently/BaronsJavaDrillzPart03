package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ProblemsTest {

    @Test
    public void helloNameTest1(){
        //Given
        Problems problems = new Problems();
        String name = "Tyron";

        //When
        String expected = "Hello Tyron!";
        String actual = problems.helloName(name);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void helloNameTest2(){
        //Given
        Problems problems = new Problems();
        String name = "Mary";

        //When
        String expected = "Hello Mary!";
        String actual = problems.helloName(name);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeOutWordTest1(){
        //Given
        Problems problems = new Problems();
        String input1 = "<<>>";
        String input2 = "Yay";

        //When
        String expected = "<<Yay>>";
        String actual = problems.makeOutWord(input1,input2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeOutWordTest2(){
        //Given
        Problems problems = new Problems();
        String input1 = "<<>>";
        String input2 = "WooHoo";

        //When
        String expected = "<<WooHoo>>";
        String actual = problems.makeOutWord(input1,input2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeOutWordTest3(){
        //Given
        Problems problems = new Problems();
        String input1 = "[[]]";
        String input2 = "word";

        //When
        String expected = "[[word]]";
        String actual = problems.makeOutWord(input1,input2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstHalfTest1(){
        //Given
        Problems problems = new Problems();
        String word = "WooHoo";

        //When
        String expected = "Woo";
        String actual = problems.helloName(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstHalfTest2(){
        //Given
        Problems problems = new Problems();
        String word = "HelloThere";

        //When
        String expected = "Hello";
        String actual = problems.helloName(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstHalfTest3(){
        //Given
        Problems problems = new Problems();
        String word = "abcdef";

        //When
        String expected = "abc";
        String actual = problems.helloName(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

}

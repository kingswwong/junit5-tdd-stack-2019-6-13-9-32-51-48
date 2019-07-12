package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_convert_given_1() {
        //given
        int input = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_2_when_convert_given_2() {
        //given
        int input = 2;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("2"));
    }
    @Test
    public void should_return_Fizz_when_convert_given_3(){
        //given
        int input = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_convert_given_5(){
        //given
        int input = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_Fizz_when_convert_given_6(){
        //given
        int input = 6;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_convert_given_10(){
        //given
        int input = 10;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_Buzz_when_convert_given_15(){
        //given
        int input = 15;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(input);
        assertThat(result, is("FizzBuzz"));
    }

}

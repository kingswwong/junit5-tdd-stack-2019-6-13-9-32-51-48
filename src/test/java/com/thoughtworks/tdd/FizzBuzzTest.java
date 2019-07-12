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
}

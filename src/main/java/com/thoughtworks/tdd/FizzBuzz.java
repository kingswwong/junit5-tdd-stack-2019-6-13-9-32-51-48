package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int number){
        String result;
        if(number % 3 == 0){
            result = "Fizz";
        }else if(number % 5 == 0){
            result = "Buzz";
        }else{
            result = number + "";
        }
        return result;
    }
}

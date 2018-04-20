package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {

    private FizzBuzzGame game = new FizzBuzzGame();

    @Test
    public void should_return_Fizz_when_have_3() {
        assertThat(game.getResult(23),equalTo("Fizz"));
        assertThat(game.getResult(30),equalTo("Fizz"));
        assertThat(game.getResult(63),equalTo("Fizz"));
        assertThat(game.getResult(35),equalTo("Fizz"));
    }

    @Test
    public void should_return_Fizz_when_only_divide_3(){
        assertThat(game.getResult(9),equalTo("Fizz"));
        assertThat(game.getResult(12),equalTo("Fizz"));
        assertThat(game.getResult(24),equalTo("Fizz"));
        assertThat(game.getResult(57),equalTo("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_only_divide_5_and_not_have_3(){
        assertThat(game.getResult(10),equalTo("Buzz"));
        assertThat(game.getResult(25),equalTo("Buzz"));
        assertThat(game.getResult(40),equalTo("Buzz"));
        assertThat(game.getResult(50),equalTo("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_only_divide_7_and_not_have_3(){
        assertThat(game.getResult(14),equalTo("Whizz"));
        assertThat(game.getResult(28),equalTo("Whizz"));
        assertThat(game.getResult(49),equalTo("Whizz"));
        assertThat(game.getResult(56),equalTo("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_divide_3_and_5_and_not_have_3(){
        assertThat(game.getResult(15),equalTo("FizzBuzz"));
        assertThat(game.getResult(60),equalTo("FizzBuzz"));
        assertThat(game.getResult(90),equalTo("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_divide_3_and_7_and_not_have_3(){
        assertThat(game.getResult(21),equalTo("FizzWhizz"));
        assertThat(game.getResult(42),equalTo("FizzWhizz"));
        assertThat(game.getResult(84),equalTo("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_divide_5_and_7_and_not_have_3(){
        assertThat(game.getResult(70),equalTo("BuzzWhizz"));
        assertThat(game.getResult(140),equalTo("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_divide_3_and_5_and_7_and_not_have_3(){
        assertThat(game.getResult(105),equalTo("FizzBuzzWhizz"));
        assertThat(game.getResult(210),equalTo("FizzBuzzWhizz"));
    }
}
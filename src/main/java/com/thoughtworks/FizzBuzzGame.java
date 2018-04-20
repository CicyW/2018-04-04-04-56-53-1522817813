package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer count;
    public Integer firstDigit = 3;
    public Integer secondDigit = 5;
    public Integer thirdDigit = 7;
    private final String firstStr = "Fizz";
    private final String secondStr = "Buzz";
    private final String thirdStr = "Whizz";

    public void start(int count) {
        this.count = count;
    }

    public List<String> getResults() {
        for(int i = 1;i<count+1;i++){
            results.add(getResult(i));
            System.out.println(getResult(i));
        }
        return results;
    }

    public String getResult(Integer number){
        if(number.toString().contains(firstDigit.toString()))
            return firstStr;
        if(number%firstDigit==0||number%secondDigit==0||number%thirdDigit==0){
            StringBuffer returnStr = new StringBuffer("");
            if (number%firstDigit==0)
                returnStr.append(firstStr);
            if (number%secondDigit==0)
                returnStr.append(secondStr);
            if (number%thirdDigit==0)
                returnStr.append(thirdStr);
            return returnStr.toString();
        }
        return number.toString();
    }

}



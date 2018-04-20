package com.thoughtworks;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        FizzBuzzGame game = new FizzBuzzGame();
        System.out.print("输入学生个数：");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        while (!StringUtils.isNumeric(input)){
            System.out.println("请输入一个正整数：");
            input = scanner.next();
        }
        game.start(Integer.parseInt(input));
        game.getResults();
    }
}

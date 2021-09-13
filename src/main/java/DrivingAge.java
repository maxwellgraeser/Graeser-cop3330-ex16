/*
 *  UCF COP3330 Fall 2021 Exercise 16 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class DrivingAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan.nextInt();

        final String output = age < 15 ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
        System.out.println(output);
    }
}

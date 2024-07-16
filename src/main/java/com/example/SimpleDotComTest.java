package com.example;

public class SimpleDotComTest {
    public static void main(String[] args) {
        // creating example of class
        SimpleDotCom dot = new SimpleDotCom();

        // creating array and adding their values where located our Web
        int[] location = {2, 3, 4};
        // calling setter for web
        dot.setLocationCells(location);

        // answering like user
        String userGuess = "1";
        String result = dot.checkYourself(userGuess);

    }
}

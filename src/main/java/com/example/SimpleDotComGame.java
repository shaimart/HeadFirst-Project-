package com.example;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        // using (int) we chop off the decimal part and from double -> int
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum +2};


        simpleDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Input number ");
            String result = simpleDotCom.checkYourself(guess);
            numOfGuess++;

            if (result.equals("Sink!")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }

}

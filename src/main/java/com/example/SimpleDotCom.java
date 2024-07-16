package com.example;

public class SimpleDotCom {
    int[] locationCells;
    int numofHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }


    public String checkYourself(String guess) {
        int x = Integer.parseInt(guess);
        String result = "Out";

        for (int i : locationCells) {
            if (x == i) {
                numofHits++;
                result = "Got it";
                break;
                }
            }

        if (numofHits == locationCells.length) {
                result = "Sink!";
            }
        System.out.println(result);
        return result;
    }


}

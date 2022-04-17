package ru.geekbrains.java2;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        String[][] strArray = new String[][] {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1h", "1"},
        };

        try {
            int sumArr = sumArrayStrings(strArray);
            System.out.println(sumArr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayStrings(String[][] strArray) {
        if (strArray.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] row : strArray) {
            if (row.length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    sum += parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
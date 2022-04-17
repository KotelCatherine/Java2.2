package ru.geekbrains.java2;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int row, int column) {
        super("Ошибка при привидении строки в число на позиции array[" + row + "][" + column + "]");
    }
}

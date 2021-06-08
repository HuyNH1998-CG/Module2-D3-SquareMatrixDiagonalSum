package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix size");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Matrix have " + size + " row and " + size + " collum");
        for (int row = 0; row < matrix.length; row++) {
            for (int collum = 0; collum < matrix[row].length; collum++) {
                System.out.println("Enter matrix row " + row + " collum " + collum + " element");
                matrix[row][collum] = input.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }
        System.out.println("Sum of the Matrix's Diagonal line is " + sum);
    }
}

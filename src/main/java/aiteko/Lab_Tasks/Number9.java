package aiteko.Lab_Tasks;

import java.util.Random;

public class Number9 implements Runner{
    @Override
    public void run() {
        System.out.println("Task №9");

        Random random = new Random();
        int number = random.nextInt( 20+1);
        System.out.print("Pascal's triangle for a number: " + number + "\n" + "\n");
        if (number == 0) {
            System.out.println("\t" + 1);
        }

        for (int row = 0; row <= number; row++) {
            int currentValue = 1;

            for (int spaces = 0; spaces < number - row; spaces++) {
                System.out.print("  "); // Выравнивание
            }

            for (int column = 0; column <= row; column++) {
                System.out.printf("%4d ", currentValue); // Вывод текущего значения
                currentValue = currentValue * (row - column) / (column + 1);  // Вычисление следующего значения
            }
            System.out.println();
        }
    }
}
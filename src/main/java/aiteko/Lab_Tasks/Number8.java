package aiteko.Lab_Tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести период десятичной дроби р = m/n для первых двух целых
положительных чисел n и m, расположенных подряд.
 */
public class Number8 implements Runner{
    @Override
    public void run() {
        System.out.println("Задание №8");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> PeriodList = randomNumbersList.create();

        long firstNumber, secondNumber, result;
        double firstDouble, resultDouble, firstTimer, secondTimer, FractionalPart;
        for (int i = 0; i < PeriodList.size(); i++) {
            firstNumber = PeriodList.get(i);
            secondNumber = PeriodList.get(i + 1);
            if (i < PeriodList.size() - 1 & firstNumber > 0 & secondNumber > 0) {
                System.out.println("First number = " + firstNumber);
                System.out.println("Second number = " + secondNumber);
                firstDouble = firstNumber / 1.0;
                firstTimer = firstNumber;
                result = firstNumber / secondNumber;
                resultDouble = firstDouble / secondNumber;
                FractionalPart = resultDouble - result;
                System.out.printf("fractional part p = %f", FractionalPart);

                System.out.print("\n");
                for (int index = 0; index < secondNumber; index++) {
                    firstTimer = (firstTimer * 10) % secondNumber;
                }
                secondTimer = firstTimer;
                int length = 0;
                // начинаем выискивать длинну периода
                do {
                    firstTimer = (firstTimer * 10) % secondNumber;
                    length++;
                } while (firstTimer != secondTimer);
                secondTimer = firstTimer = firstNumber;
                for (int index = 0; index < length; index++) {
                    firstTimer = (firstTimer * 10) % secondNumber;
                }
                double vrem = secondTimer;
                for (int index = 0; index < length; index++) {
                    if (vrem == secondTimer){
                    System.out.print ("The period is equal to: " + (secondTimer / secondNumber) %1 ); break;}
                    else {vrem = secondTimer;}
                }
                //выводим дробь
                    System.out.println(" for shot " + firstNumber + "/" + secondNumber + "\n");
                break;
            }
        }
    }
}
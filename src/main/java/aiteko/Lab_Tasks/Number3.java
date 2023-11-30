package aiteko.Lab_Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью.
Например, для цифры 9 на консоли должна быть напечатана строка «Девять».
 */
public class Number3 implements Runner{
    @Override
    public void run() {
        System.out.println("Task №3");

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number between 0 and 9: ");
            int input_Num = input.nextInt();
            input.close();
            if (input_Num < 10 && input_Num > -1) System.out.print("You entered a number: ");
            //выводит буквенное выражение введенного числа
            switch (input_Num) {
                case 0:
                    System.out.print("Null" + "\n");
                    break;
                case 1:
                    System.out.print("One" + "\n");
                    break;
                case 2:
                    System.out.print("Two" + "\n");
                    break;
                case 3:
                    System.out.print("Three" + "\n");
                    break;
                case 4:
                    System.out.print("For" + "\n");
                    break;
                case 5:
                    System.out.print("Five" + "\n");
                    break;
                case 6:
                    System.out.print("Six" + "\n");
                    break;
                case 7:
                    System.out.print("Seven" + "\n");
                    break;
                case 8:
                    System.out.print("Eight" + "\n");
                    break;
                case 9:
                    System.out.print("Nine" + "\n");
                    break;
                default:
                    System.out.print("Error! The number is not within the specified range\nRun the program again and enter a number from 0 to 9" + "\n");
            }
        }catch (InputMismatchException e){//срабатывает когда в поле ввода вводится неправильное значение
            System.out.println("An invalid value has been entered. Only integers are suitable for input" + "\n");
        }
        System.out.println("\n");
    }
}
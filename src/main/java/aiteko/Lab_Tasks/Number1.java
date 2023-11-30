package aiteko.Lab_Tasks;

import java.util.Scanner;
/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести простые числа.
 */
public class Number1 implements Runner {
    @Override
    public void run() {
        System.out.println("Task №1");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //выводим простые числа
        System.out.print("Prime Numbers: ");
        Simple_Num a = new Simple_Num();
        for (int i = 0; i < n; i++) {
            a.check_Number(arr[i]);
        }
        System.out.println("\n");
    }


    public class Simple_Num { //простые числа это те числа которые делятся на 1 и сами на себя, а еще они больше 1
        int var = 2;

        public void check_Number(int num) {
            if (num > 1) {// простые числа обязательно больше единицы
                //делаем это пока остаток от деления не будет равен 0
                if (num % var != 0) {
                    var++;
                    check_Number(num);
                } else if (num % var == 0 && num == var) {
                    System.out.print(num + " ");
                    var = 2;
                }
            }
        }
    }
}
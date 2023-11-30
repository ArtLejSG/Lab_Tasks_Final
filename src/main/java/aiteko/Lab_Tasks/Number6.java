package aiteko.Lab_Tasks;

import java.util.*;

/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести числа Фибоначчи: f0 = f1 = 1, f (n) = f (n-1) + f (n-2).
 */
public class Number6 implements Runner{
    @Override
    public void run() {
        System.out.println("Task №6");

        ArrayList<Long> nums = new ArrayList<Long>();
        ArrayList<Long> output = new ArrayList<Long>();

        long numFibonaachi0 = 0;
        long numFibonaachi1 = 1;
        nums.add(0, numFibonaachi0);
        nums.add(1, numFibonaachi1);

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> fibonacciList = randomNumbersList.create();
        System.out.println(fibonacciList );

        long add_num;
        for(int i = 2; i<50;i++){
            add_num = nums.get(i-2) + nums.get(i-1);
            nums.add(i, add_num);
        }

        System.out.print("Numbers included in the Fibonacci sequence: " + "\n");
        int count = 0;
        for (long num:fibonacciList){
            for (long numl:nums){
                if ( num == numl ){
                    output.add(count, num);
                    count++;
                    //System.out.print(" " + num);
                    break;
                }
            }
        }
//
        HashSet<Long> uniqueSet = new HashSet<>(output);
        List<Long> sortedListWithoutDuplicates = new ArrayList<>(uniqueSet);
        Collections.sort((sortedListWithoutDuplicates));
            if (count > 0) {
                for (long out:sortedListWithoutDuplicates) System.out.print(" " + out);
            }
            else System.out.print("There are no numbers included in the Fibonacci sequence.");
            System.out.println("\n" + "\n");
    }
}
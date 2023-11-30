package aiteko.Lab_Tasks;

import java.util.*;

public class Number2 implements Runner{
    @Override
    public void run() {
        System.out.println("Task 2");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> LuckyList = randomNumbersList.create();
        ArrayList<Long> output = new ArrayList<Long>();
        int count = 0;
        for(int number:LuckyList){
        if (isHappyNumber(number)) {
            output.add(count, (long) number);
            count++;
        }else {continue;}
    }
        HashSet<Long> uniqueSet = new HashSet<>(output);
        List<Long> sortedListWithoutDuplicates = new ArrayList<>(uniqueSet);
        Collections.sort((sortedListWithoutDuplicates));
        System.out.println("Lucky Numbers: " + sortedListWithoutDuplicates);
    }

        public static boolean isHappyNumber(int number) {
            int sum = 0;
            int digit;
            while (number != 0) {
                digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                return isHappyNumber(sum);
            }
        }
    }
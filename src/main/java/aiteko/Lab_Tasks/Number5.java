package aiteko.Lab_Tasks;

import java.util.Random;

public class Number5 implements Runner{
    @Override
    public void run() {
        System.out.println("Task №5");

        Random expression = new Random();
        int randomNumber = expression.nextInt(100);
        System.out.print("The expression for n = " + randomNumber + "\n");

        for (int i = 2; i < 10001; i++){
            if (i%2==0) randomNumber -= (randomNumber/i);
            else randomNumber += (randomNumber/i);
        }
        System.out.print("Results: " + randomNumber + "\n" + "\n");
    }
}
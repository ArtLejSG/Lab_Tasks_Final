package aiteko.Lab_Tasks;

import java.util.*;

/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести числа-полиндромы, значения которых в прямом и обратном порядке совпадают.
 */
public class Number7 implements Runner{
    @Override
    public void run() {
        System.out.println("Task №7");
        ArrayList<Long> output = new ArrayList<Long>();
        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> PolindromNumers = randomNumbersList.create();
        System.out.print("Number-polylindromes: ");
        int count = 0;
        for (int i = 0; i< PolindromNumers.size() -1; i++){
            StringBuffer temp = new StringBuffer(Integer.toString(PolindromNumers.get(i)));
            String word = temp.toString();
            String wordreverse = temp.reverse().toString();
            if(word.equals(wordreverse)) {
                Long longElement = Long.parseLong(word);
                output.add(count, longElement);
                count++;
            }
        }
        HashSet<Long> uniqueSet = new HashSet<>(output);
        ArrayList<Long> NewOutput = new ArrayList<>(uniqueSet);
        Collections.sort(NewOutput);

        System.out.print( NewOutput + "\n" + "\n");
    }
}
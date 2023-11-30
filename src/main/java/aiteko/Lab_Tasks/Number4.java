package aiteko.Lab_Tasks;

/*
Создайте приложение, которое покажет,
что для выражения an+bn=cn (теорема Ферма) нет натуральных решений от 1 до 100 и n>2.
Убедитесь, что есть решения для n=2, и выведите их в консоль.
 */
public class Number4 implements Runner {
    @Override
    public void run() {
        System.out.println("Task №4");

        boolean solutionsExist = false;

        for (int n = 1; n <= 100; n++) {
            for (int a = 1; a <= 100; a++) {
                for (int b = 1; b <= 100; b++) {
                    for (int c = 1; c <= 100; c++) {
                        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2) {
                            solutionsExist = true;
                            break;
                        }
                    }
                    if (solutionsExist) {
                        break;
                    }
                }
                if (solutionsExist) {
                    break;
                }
            }
            if (!solutionsExist && n ==2){ continue;}
            else if (!solutionsExist) {
                System.out.println("For n = " + n + " solutions do not exist.");
            }
            solutionsExist = false;
        }

        System.out.println("Solutions for n = 2:");

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
        System.out.println("\n");
    }
}
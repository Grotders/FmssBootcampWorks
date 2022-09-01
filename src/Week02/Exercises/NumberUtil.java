package Week02.Exercises;

import java.util.Random;

public class NumberUtil {
    // exercise 1
    public static int getDigitsCount(int number) {
        int digit = 0;
        while (number != 0) {
            number /= 10;
            ++digit;
        }
        return digit;
    }

    // exercise 2
    public static int getReverse(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    // exercise 3
    public static int pow(int a, int b) {
        int result = 1;

        for (int i = 0; i<b; i++) {
            result *= a;
        }
        return result;
    }

    // exercise 4
    public static boolean isArmstrong(int number) {
        int digit = getDigitsCount(number);
        int originalNumber = number;
        int sum = 0, remainder;

        while (number > 0) {
            remainder = number % 10;
            sum += pow(remainder, digit);
            number /= 10;
        }
        return originalNumber == sum;
    }

    // exercise 5
    public static long factorial(int number) {
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(1,7);
    }
}

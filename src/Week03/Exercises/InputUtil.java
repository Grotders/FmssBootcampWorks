package Week03.Exercises;

import java.util.Random;
import java.util.Scanner;

public class InputUtil {

    public static String getInput(String text) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(text);
        return keyboard.nextLine();
    }

    public static int getIntInput(String text) {
        return Integer.parseInt(getInput(text));
    }

    public static int getRandomInt() {
        return getRandomInt(3,20);
    }
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max+1);
    }
}

package Week03.Exercises;

import java.util.Locale;

public class StringUtil {
    final static Character [] alphabetTR = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n',
                                'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};

    final static Character [] alphabetEN = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    // Turkish character problem: I -> ı
    public static boolean isPangramTR(String text) {
        String lowerCaseTextTR = text.toLowerCase(Locale.forLanguageTag("tr-TR"));

        for (var e : alphabetTR) {
            if (!lowerCaseTextTR.contains(e.toString())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPangramEN(String text) {
        String lowerCaseText = text.toLowerCase();

        for (var e : alphabetEN) {
            if (!lowerCaseText.contains(e.toString())) {
                return false;
            }
        }
        return true;
    }

    private static String cleanText(String text) {
        return text.replaceAll("[^A-Za-z]", "").toLowerCase();
    }

    public static boolean isPalindrome(String text) {
        String cleanedLowerCaseText = cleanText(text);

        int length = cleanedLowerCaseText.length();
        for (int i=0; i < length; i++) {
            if (cleanedLowerCaseText.charAt(i) != cleanedLowerCaseText.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    private static String generateRandomString() {
        int length = InputUtil.getRandomInt();
        String text = "";
        for (int i=0; i<length; i++) {
            char ch = (char) InputUtil.getRandomInt(97, 122); // a to z
            text += ch;
        }
        return text;
    }

    public static String[] generateRandomStringArray(int size) {
        String [] array = new String[size];

        for (int i=0; i<size; i++) {
            array[i] = generateRandomString();
        }

        return array;
    }

    public static String arrayToString(String[] array) {
        String text = "";
        for (int i=0; i<array.length; i++) {
            if (i == 0)
                text = array[i];

            text += "-" + array[i];
        }
        return text;
    }
}
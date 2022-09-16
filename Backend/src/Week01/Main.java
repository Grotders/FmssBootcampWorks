package Week01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        odev1();
        odev2();
    }

/*----------------------------------------------------------------------------------------------------------------------
    Odev1
        Sınıf Çalışması: Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü
    kullanmadan döndüren getDigitsSum metodunu yazınız. Metot sayının basamak sayısı kontrolünü yapmayacaktır
----------------------------------------------------------------------------------------------------------------------*/
    public static void odev1() {
        int result = getDigitSum(331);
        System.out.println("result: " + result);
    }

    public static int getDigitSum(int number) {
        // base case
        if (number == 0)
            return 0;

        // recursive case
        return number % 10 + getDigitSum(number / 10);
    }
/*----------------------------------------------------------------------------------------------------------------------
    Odev2
        Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana basan
    programı yazınız
----------------------------------------------------------------------------------------------------------------------*/
    public static void odev2() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("2. dereceden bir denklemin köklerini bulan program. (a(x^2) * bx + c)\n");
        System.out.print("a: ");
        int a = Integer.parseInt(keyboard.nextLine());
        System.out.print("b: ");
        int b = Integer.parseInt(keyboard.nextLine());
        System.out.print("c: ");
        int c = Integer.parseInt(keyboard.nextLine());

        rootFinder(a, b, c);
    }

//        // △ > 0
//        QuadraticEquation equation = new QuadraticEquation(1,-7,12);
//        equation.rootFinder();
//
//        // △ = 0
//        QuadraticEquation equation2 = new QuadraticEquation(1,-8,16);
//        equation2.rootFinder();
//
//        // △ < 0
//        QuadraticEquation equation3 = new QuadraticEquation(3,3,5);
//        equation3.rootFinder();
//   a(x^2) * bx + c
    public static void rootFinder(int a, int b, int c) {
        String resultText = a + "(x^2) + " + b + "x + " + c + "\n";
        int delta = delta(a, b, c);
        double roots[] = bhaskaraFormula(a, b, delta);

        if (delta > 0) {
            resultText += "△: " + delta + "  -->  △ > 0  \ttwo distinct real root  (x1 ≠ x2)\n";
        } else if (delta == 0){
            resultText += "△: " + delta + "  -->  △ = 0  \ttwo same real root      (x1 = x2)\n";
        } else {
            resultText += "△: " + delta + "  -->  △ < 0  \tno real root\n";
        }
        resultText += "\nroot 1: " + roots[0];
        resultText += "\nroot 2: " + roots[1] + "\n";

        System.out.println(resultText);
    }

    // delta(△) = (b^2) - 4ac
    public static int delta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);

        return delta;
    }

    /* bhaskara formula:

             -b + √(delta)          -b - √(delta)
         ---------------------, ---------------------
                 2 * a                  2 * a

     */
    public static double[] bhaskaraFormula(int a, int b, int delta) {
        double roots[] = new double[2];

        roots[0] = ( -1 * b + Math.sqrt(delta)) / 2 * a;
        roots[1] = ( -1 * b - Math.sqrt(delta)) / 2 * a;

        return roots;
    }
}


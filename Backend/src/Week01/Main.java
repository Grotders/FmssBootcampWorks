package Week01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
        Odev1
            Sınıf Çalışması: Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü
        kullanmadan döndüren getDigitsSum metodunu yazınız. Metot sayının basamak sayısı kontrolünü yapmayacaktır
----------------------------------------------------------------------------------------------------------------------*/

//        int result = getDigitSum(331);
//        System.out.println("result: " + result);

/*----------------------------------------------------------------------------------------------------------------------
        Odev2
            Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana
        basan programı yazınız
----------------------------------------------------------------------------------------------------------------------*/
        rootFinder();

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
    }

    // a(x^2) * bx + c
    public static void rootFinder() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("2. dereceden bir denklemin köklerini bulan program. (a(x^2) * bx + c)\n");
        System.out.print("a: ");
        int a = Integer.parseInt(keyboard.nextLine());
        System.out.print("b: ");
        int b = Integer.parseInt(keyboard.nextLine());
        System.out.print("c: ");
        int c = Integer.parseInt(keyboard.nextLine());
        System.out.println();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.rootFinder();
    }

    public static int getDigitSum(int number) {
        // base case
        if (number == 0)
            return 0;

        // recursive case
        return number % 10 + getDigitSum(number / 10);
    }
}


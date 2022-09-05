package Week02.Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
        exercise7();
//        exercise8();
//        exercise9();
//        exercise10();
//        exercise11();
//        exercise12();
    }


// Exercise 1
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak test ediniz

	123 -> 12 -> 1 -> 0
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise1() {
        int number = Integer.parseInt(getInput("Sayı giriniz: "));
        int digit = NumberUtil.getDigitsCount(number);
        System.out.println(number + " sayısı " + digit + " tane basamağa sahiptir.");
    }

// Exercise 2
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren getReverse isimli metodu
	yazınız ve test ediniz. Örneğin -123 sayısı için metot -321 sayısını döndürecektir
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise2() {
        int number = Integer.parseInt(getInput("Sayı giriniz: "));
        int reverse = NumberUtil.getReverse(number);
        System.out.println(number + " sayısının tersi: " + reverse);
    }

// Exercise 3
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren
	pow isimli metodu yazınız.
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot b nin negatif değerleri için 1 değerini döndürecektir
	- Metot NumberUtil sınıfı içerisinde yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise3() {
        int a = Integer.parseInt(getInput("a sayısını giriniz: "));
        int b = Integer.parseInt(getInput("b sayısını giriniz: "));
        int pow = NumberUtil.pow(a, b);
        System.out.println(a + "^" + b + ": " + pow);
    }

// Exercise 4
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden
	isArmstrong metodunu yazınız ve test ediniz.
	Açıklamalar:
	- Bir sayının her basamağının basamak sayıncı kuvvetleri toplamı sayının kendisine eşitse bu sayıya Armstrong
	sayısı denir
	153 -> 1 + 125 + 27 = 153
	- Sayı negatif ise false döndürebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise4() {
        int number = Integer.parseInt(getInput("Amstrong sayısı mı?\nSayı giriniz: "));
        String text = NumberUtil.isArmstrong(number) ? "Amstrong sayısıdır." : "Amstrong sayısı değildir.";
        System.out.println(number + " sayısı bir " + text);
    }

// Exercise 5
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelini döndüren factorial isimli
	metodu yazınız ve test ediniz.
	Açıklamalar:
	- Metot negatif sayılar için -1 değerini döndürecektir
	- Faktoriyel tanımı:
		0!= 1
		1!=1
		2!=1*2
		...
		n!=1 * 2 * ...* (n - 1) * n
	- Sınır taşması gözardı edilecektir
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise5() {
        int number = Integer.parseInt(getInput("Faktoriyel bul\nSayı giriniz: "));
        long factorial = NumberUtil.factorial(number);
        System.out.println(number + "! = " + factorial);
    }

// Exercise 6
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden bir yıl değerine göre yılın artık yıl olup olmadığını
	test eden isLeapYear isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise6() {
        int year = Integer.parseInt(getInput("Leap year testi\nYılı giriniz: "));
        String text = DateUtil.isLeapYear(year) ? "is Leap Year." : "isn't Leap Year.";
        System.out.println(year + " " + text);
    }

// Exercise 7
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli bir
	tarih olup olmadığını test eden isValidDate isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise7() {
        System.out.println("is this date valid? (day, month, year)");
        int day = Integer.parseInt(getInput("Günü giriniz: "));
        int month = Integer.parseInt(getInput("Ayı giriniz: "));
        int year = Integer.parseInt(getInput("Yılı giriniz: "));

        String text = DateUtil.isValidDate(day, month, year) ? "is valid date." : "isn't valid date.";
        System.out.println(day + "." + month + "." + year + " -> " + text);
    }

// Exercise 8
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı
	günü olduğunu döndüren getDayOfYear isimli metodu yazınız ve test ediniz. Metot geçersiz bir tarih için
	-1 değerini döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise8() {
        System.out.println("day of year (day, month, year)");
        int day = Integer.parseInt(getInput("Günü giriniz: "));
        int month = Integer.parseInt(getInput("Ayı giriniz: "));
        int year = Integer.parseInt(getInput("Yılı giriniz: "));

        int dayOfYear = DateUtil.getDayOfYear(day, month, year);
        System.out.println(day + "." + month + "." + year + " -> day of year: " + dayOfYear);
    }

// Exercise 9
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki
	açıklamalara göre haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız.
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerini döndürecektir.
		- Haftanın günü 1.1.1900 ile verilen tarih arasındaki gün sayısının 7 değerine modu alınarak bulunabilir
		- 7 değerine mod alındıktan sonra sıfır Pazar, 1 pazartesi, .., 6 cumartesi günü için
		elde edilecek değerdir
		- 1.1.1900' den önceki tarihler geçersiz kabul edilecektir
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise9() {
        System.out.println("date to which day is it (day, month, year)");
        int day = Integer.parseInt(getInput("Günü giriniz: "));
        int month = Integer.parseInt(getInput("Ayı giriniz: "));
        int year = Integer.parseInt(getInput("Yılı giriniz: "));

        String text = DateUtil.getDayName(day, month, year);

        System.out.println(text);
    }

// Exercise 10
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız:
	Açıklamalar:
	- Kullanıcı adı ve şifre 3 kez denenebilecektir
	- 3 kez deneme sırasında doğru giriş yapılırsa "Giriş Başarılı", 3 kez deneme de yanlış olursa
	"Giriş Başarısız. Deneme hakkınız bitti" mesajı verilecektir.
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacacktır
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise10() {
        System.out.println("Atm uygulaması");
        int maxAttempts = 3;
        String correctUsername = "oguzcan";
        String correctPassword = "12345";

        while (maxAttempts != 0) {
            String username = getInput("Kullanıcı adı: ");
            String password = getInput("Sifre: ");

            if (!correctUsername.equals(username) || !correctPassword.equals(password)) {
                --maxAttempts;
                System.out.println("Yanlış kullanıcı adı veya şifre. Kalan deneme hakkı " + maxAttempts);
            } else
                break;
        }
        String text = maxAttempts != 0 ? "Giriş başarılı." : "Giriş başarısız. Deneme hakkınız bitti.";
        System.out.println(text);
    }

// Exercise 11
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: İki zar atıldığında zarların çift gelmesi (ikisi de aynı) olasılığını yaklaşık hesaplayan
	basit simülasyon programını yazınız
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise11() {
        int cycle = Integer.parseInt(getInput("Kaç kere çift zar atmak istiyorsun: "));
        int count = 0;
        for (int i=0; i<cycle; i++) {
            if (NumberUtil.getRandomNumber() == NumberUtil.getRandomNumber())
                ++count;
        }
        double probability = (double) count / cycle;
        System.out.println(cycle + ". kere çift zar atıldı -> %" + probability + " tanesi çift");
    }

// Exercise 12
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden quit girilene kadar alınan yazıların arasında - karakteri olacak şekilde
	birleştirilmiş bir String oluşturan programı yazınız.
	Örnek:
	ankara, istanbul, izmir girilirse
	ankara-istanbul-izmir
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise12() {
        String text = "";
        String fullText = "";
        while (!text.equalsIgnoreCase("quit")) {
            if (!fullText.isEmpty()) {
                fullText += "-";
            }
            fullText += text;
            System.out.println(fullText);
            text = getInput("Enter input: ");
        }
        System.out.println("Result: " + fullText);
    }

// Utility methods
    private static String getInput(String text) {
        System.out.print(text);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
}




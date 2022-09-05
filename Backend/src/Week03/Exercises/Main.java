package Week03.Exercises;

import Week03.Exercises.School.Student;

public class Main {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();
    }

// Exercise 1
/*----------------------------------------------------------------------------------------------------------------------
     Sınıf Çalışması: Parametresi ile aldığı bir yazının Türkçe pangram olup olmadığını test eden isPangramTR
     ve İngilizce pangram olup olmadığını test eden isPangramEN isimli metotları yazınız ve test ediniz.
     Pangram: İçerisinde özel isim bulunmayan anlamlı ve ilgili alfabenin tüm karakterlerini içeren cümlelere denir.
     Örnekler:
     İngilizce Pangram:
         The quick brown fox jumps over the lazy dog
     Türkçe:
         Pijamalı hasta yağız şoföre çabucak güvendi
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise1() {
        String text1 = "abcdef";

        String text2 = "Pijamalı hasta yağız şoföre çabucak güvendi";
        String text3 = "The quick brown fox jumps over the lazy dog";

        System.out.println(text1 + "  --->  " + (StringUtil.isPangramTR(text1) ? "is " : "isn't ") + "Pangram");
        System.out.println(text2 + "  --->  " + (StringUtil.isPangramTR(text2) ? "is " : "isn't ") + "Pangram");
        System.out.println(text3 + "  --->  " + (StringUtil.isPangramEN(text3) ? "is " : "isn't ") + "Pangram");
        System.out.println(text1 + "  --->  " + (StringUtil.isPangramEN(text1) ? "is " : "isn't ") + "Pangram");
    }

// Exercise 2
/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome
	 isimli metodu yazınız ve test ediniz
	 Palindrom: Yalnızca alfabetik karakterleri tersten de okunduğunda aynı olan yazılara denir. Yani alfabetik
	 dışı karakterler yok sayılır

	 Örnek:
	 ey edip Adana'da pide ye -> eyedipadanadapideye
	 Anastas mum satsana -> anastasmumsatsana
	 Ali Papila -> alipapila
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise2() {
        String text1 = "ey edip Adana'da pide ye";
        String text2 = "Anastas mum satsana";
        String text3 = "Ali Papila";
        String text4 = "pleaseRun";

        System.out.println(text1 + " --->  " + (StringUtil.isPalindrome(text1) ? "is " : "isn't ") + "Palindrome");
        System.out.println(text2 + " --->  " + (StringUtil.isPalindrome(text2) ? "is " : "isn't ") + "Palindrome");
        System.out.println(text3 + " --->  " + (StringUtil.isPalindrome(text3) ? "is " : "isn't ") + "Palindrome");
        System.out.println(text4 + " --->  " + (StringUtil.isPalindrome(text4) ? "is " : "isn't ") + "Palindrome");
    }

// Exercise 3
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Klavyden int türden bir n sayısı isteyiniz. n elemanlı bir String dizisi yaratınız.
	Bu dizinin her bir elemanını rasgele uzunlukta rasgele üretilmiş yazılarla doldurunuz. Bu işlemden sonra
	dizinin elemanlarını aralarında - (tire) karakteri olacak şekilde birleştirip yeni bir String elde eden
	programı yazınız
----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise3() {
        int size = InputUtil.getIntInput("Bir sayı giriniz: ");

        String[] array = StringUtil.generateRandomStringArray(size);
        String text = StringUtil.arrayToString(array);
        System.out.println(text);
    }
// Exercise 4
/*----------------------------------------------------------------------------------------------------------------------
    Sınıf çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana yazdıran programı yazınız.
    Not: Geçerlilik kontrolü yapılmayacaktır.

    <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
    Oğuz karan:10/09/1976:Matematik:90:100

    Bu formatta kişinin vize final notlarına vize * %40 + final * %60 formulüne göre geçme notunu hesaplayan ve doğum
    tarihinin hangi güne geldiğini yazdıran programı yazınız

----------------------------------------------------------------------------------------------------------------------*/
    public static void exercise4() {
        String record = "Oğuz karan:10/09/1976:Matematik:90:100";
        Student st = new Student(record);

        System.out.println(st);
    }
}
